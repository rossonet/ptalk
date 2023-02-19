#!/bin/bash
mkdir -p data
docker run -p 8888:8888 --name jupyter --rm -v $(pwd)/data:/home/jovyan/work \
       rossonet/jupyter-lab:latest 
       #jupyter/scipy-notebook
