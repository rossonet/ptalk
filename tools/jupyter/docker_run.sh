#!/bin/bash
docker run -p 8888:8888 --rm -v $(pwd)/data:/home/jovyan/work jupyter/scipy-notebook
