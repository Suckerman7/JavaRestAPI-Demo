FROM openjdk:17-jdk-alpine

COPY ./target/rest-api-demo-0.0.1-SNAPSHOT.jar /usr/app/

ENTRYPOINT ["java","-jar","/app.jar"]