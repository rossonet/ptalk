#!/bin/bash
echo the parameters wrote in the script invocation are used in the docker run command
mkdir -p data
docker run $@ -p 8888:8888 -p 7860:7860 -p 11214:11214 --name jupyter --rm -v $(pwd)/data:/home/jovyan/work \
       rossonet/jupyter-lab:latest 
       #jupyter/scipy-notebook
