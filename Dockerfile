FROM ubuntu:14.04

RUN apt-get update & apt-get install -y wkhtmltopdf
RUN mkdir /root/
RUN mkdir /root/www

# ADD [some files...] /root
# ADD [some files...] /root/www

WORKDIR "/root/"
EXPOSE 8080
