FROM java:8-jre
MAINTAINER Koduru Hari Krishna "koduruhari5621@gmail.com"

RUN mkdir /src

WORKDIR /src

COPY target/hystrix-0.0.1-SNAPSHOT.jar /src/hystrix-dashboard-1.0.0.jar

EXPOSE 9087

RUN sh -c 'touch /src/hystrix-dashboard-1.0.0.jar'

ENTRYPOINT ["java","-jar","/src/hystrix-dashboard-1.0.0.jar"]