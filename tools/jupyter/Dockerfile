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
COPY ./examples /home/jovyan/examples
COPY ./nlu /home/jovyan/nlu
COPY ./channel /home/jovyan/channel
COPY ./ability /home/jovyan/ability
COPY ./grpc-client /home/jovyan/grpc-client
USER root
RUN whoami && chown -R jovyan /home/jovyan/examples && chmod -R g+rw /home/jovyan/examples
USER jovyan
ENV JUPYTER_ENABLE_LAB=yes
