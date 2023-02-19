FROM jupyter/tensorflow-notebook:lab-3.6.1
ARG MAINTAINER="Andrea Ambrosini <andrea.ambrosini@rossonet.org>"
RUN conda install -y -c pytorch pytorch torchvision torchaudio cpuonly
RUN conda install -y -c conda-forge diffusers
RUN conda install -y -c huggingface transformers
ENV JUPYTER_ENABLE_LAB=yes
