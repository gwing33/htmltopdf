FROM ubuntu:14.04

# INSTALL OS DEPENDENCIES
RUN apt-get update && apt-get install -y software-properties-common

# INSTALL JAVA 8
RUN echo debconf shared/accepted-oracle-license-v1-1 select true | debconf-set-selections && \
    echo debconf shared/accepted-oracle-license-v1-1 seen true | debconf-set-selections && \
    add-apt-repository -y ppa:webupd8team/java && \
    apt-get update && \
    apt-get install -y oracle-java8-installer

# Install wkhtmltopdf
RUN apt-get install -y wkhtmltopdf build-essential xorg libssl-dev xvfb
ADD wkhtmltopdf.sh /usr/local/bin/

ADD play/target/universal/stage /root

# Add the easy to use commands
ADD /cmds/ /usr/local/bin/

WORKDIR "/root/"
EXPOSE 9000
