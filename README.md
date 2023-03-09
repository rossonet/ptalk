
# PTalk - ChatBOT Rossonet

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

## Deploy Bottegaio Terminal Client

```
[andrea@legion-rossonet-com ptalk]$ ./gradlew clean buildBottegaioTerminalClient

> Configure project :ptalk-ability-api
starting clean in /home/andrea/git/ptalk/ptalk-ability-api

> Configure project :ptalk-channel-api
starting clean in /home/andrea/git/ptalk/ptalk-channel-api

> Configure project :ptalk-channel-grpc
starting clean in /home/andrea/git/ptalk/ptalk-channel-grpc

> Configure project :ptalk-nlu-api
starting clean in /home/andrea/git/ptalk/ptalk-nlu-api

Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/7.4/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 8s
31 actionable tasks: 23 executed, 8 up-to-date
```

## Reference

[https://www.graalvm.org/dev/reference-manual/native-image/#install-native-image](https://www.graalvm.org/dev/reference-manual/native-image/#install-native-image)

[Library Documentation](https://www.rossonet.net/dati/edge-docs/doc-site/)

[Tech blog](https://app.rossonet.net/?page_id=13)

### Project sponsor 

[![Rossonet s.c.a r.l.](https://raw.githubusercontent.com/rossonet/images/main/artwork/rossonet-logo/png/rossonet-logo_280_115.png)](https://www.rossonet.net)



