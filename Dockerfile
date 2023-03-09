FROM ubuntu:20.04 as builder
ARG COMPONENT
RUN apt update && DEBIAN_FRONTEND=noninteractive apt install -y openjdk-11-jdk
COPY . /workspace
RUN cd /workspace && echo "build $COMPONENT" && ./gradlew clean :$COMPONENT:distTar

FROM eclipse-temurin:17-jdk-jammy
ARG COMPONENT
EXPOSE 2045
ENTRYPOINT ["java"]
CMD ["-cp","/app/lib/*","-XX:+UnlockExperimentalVMOptions","-Djava.net.preferIPv4Stack=true","-XshowSettings:vm","-Djava.security.egd=file:/dev/./urandom", "net.rossonet.ptalk.MainApp"]
RUN mkdir -p /app
COPY --from=builder /workspace/$COMPONENT/build/distributions/$COMPONENT*.tar /tmp/
RUN tar -xf /tmp/*.tar -C ./app --strip-components=1 && rm -rf /tmp/*.tar
