FROM maven:latest as builder
WORKDIR /app
COPY . /app
RUN mvn clean package

FROM tomcat:9

COPY ./target/maven-tomcat-spring-api-1.0.0.war /usr/local/tomcat/webapps/api.war

CMD ["catalina.sh", "run"]
