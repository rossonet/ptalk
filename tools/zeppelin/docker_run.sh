#!/bin/bash
mkdir -p notebook
mkdir -p logs
docker run -u $(id -u) -p 8080:8080 --rm -v $PWD/logs:/logs -v $PWD/notebook:/notebook \
           -e ZEPPELIN_LOG_DIR='/logs' -e ZEPPELIN_NOTEBOOK_DIR='/notebook' \
	   --rm \
           --name zeppelin \
	   rossonet/zeppelin-lab:latest
	   #apache/zeppelin:0.10.0

