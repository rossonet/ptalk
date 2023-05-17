
# PTalk - ChatBOT Rossonet

## Import in Eclipse IDE

Download Eclipse Java IDE [here](https://www.eclipse.org/downloads/packages/release/2022-12/r/eclipse-ide-java-developers).

Run on the main directory of the project the follow command.

```
[andrea@legion-rossonet-com ptalk]$ ./gradlew clean cleanEclipse eclipse generateProto

Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/7.4/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 2s
120 actionable tasks: 97 executed, 23 up-to-date

```

## Develop enviroment with Docker Compose

```
[andrea@legion-rossonet-com ptalk]$ docker-compose up -d
Starting ptalk_hazelcast_1 ... done
Starting ptalk_ptalk-engine_1 ... done
Starting ptalk_ptalk-channel-mqtt_1         ... done
Starting ptalk_ptalk-channel-http_1         ... done
Starting ptalk_ptalk-nlu-watson_1           ... done
Starting ptalk_ptalk-channel-grpc_1         ... done
Starting ptalk_ptalk-ability-homunculus_1   ... done
Starting ptalk_ptalk-ability-processmaker_1 ... done
Starting ptalk_ptalk-channel-telegram_1     ... done
```

## Reference

[https://www.graalvm.org/dev/reference-manual/native-image/#install-native-image](https://www.graalvm.org/dev/reference-manual/native-image/#install-native-image)

[Library Documentation](https://www.rossonet.net/dati/edge-docs/doc-site/)

[Tech blog](https://app.rossonet.net/?page_id=13)

### Project sponsor 

[![Rossonet s.c.a r.l.](https://raw.githubusercontent.com/rossonet/images/main/artwork/rossonet-logo/png/rossonet-logo_280_115.png)](https://www.rossonet.net)



