FROM tomcat:8.0
LABEL maintainer="sittinon"
RUN apt-get update
RUN apt-get install vim
COPY Assignment2-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/