FROM openjdk:17-jdk

MAINTAINER "naresh.avula@gmail.com"

COPY target/springOauth2Demo.jar  /usr/app/springOauth2Demo.jar

WORKDIR /usr/app/

EXPOSE 9090

ENTRYPOINT ["java","-jar","springOauth2Demo.jar"]
