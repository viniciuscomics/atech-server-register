FROM openjdk:8u171-jdk-alpine3.8
LABEL maintainer="vinicius_csa@yahoo.com.br"

ENV LANG C.UTF8

RUN apk add --update bash

ADD target/*.jar /app/app.jar

CMD java -jar /app/app.jar $APP_OPTIONS