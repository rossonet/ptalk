FROM jupyter/tensorflow-notebook:lab-3.6.1
ARG MAINTAINER="Andrea Ambrosini <andrea.ambrosini@rossonet.org>"
RUN conda install -y -c pytorch pytorch torchvision torchaudio cpuonly
RUN conda install -y -c conda-forge diffusers
RUN conda install -y -c huggingface transformers
RUN conda install -y -c conda-forge gradio
RUN conda install -y -c conda-forge torchinfo
RUN conda install -y -c plotly plotly
RUN conda install -y -c conda-forge streamlit
RUN conda install -y -c conda-forge librosa
RUN conda install -y -c anaconda nltk
RUN conda install -y -c conda-forge grpcio grpcio-tools
RUN conda install -y -c conda-forge matplotlib seaborn bokeh
RUN pip install git+https://github.com/openai/whisper.git
RUN conda update ffmpeg
USER root
RUN apt update && \
  DEBIAN_FRONTEND=noninteractive apt install gstreamer1.0-plugins-bad libavcodec-extra gstreamer1.0-plugins-ugly gstreamer1.0-libav -y && \
  DEBIAN_FRONTEND=noninteractive apt-get upgrade -y && \
  apt-get clean && rm -rf /var/lib/apt/lists/*
COPY ./examples /home/jovyan/examples
COPY ./base /home/jovyan/base
COPY ./nlu /home/jovyan/nlu
COPY ./channel /home/jovyan/channel
COPY ./ability /home/jovyan/ability
COPY ./channel-grpc /home/jovyan/channel-grpc
COPY ./tools /home/jovyan/tools
RUN chown -R jovyan /home/jovyan && chmod -R g+rw /home/jovyan
USER jovyan
ENV JUPYTER_ENABLE_LAB=yes
