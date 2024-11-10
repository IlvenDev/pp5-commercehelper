FROM openjdk:23-jdk-slim

WORKDIR /app

COPY target/backend-1.0-SNAPSHOT.jar app/backend-1.0-SNAPSHOT.jar

EXPOSE 8888

ENTRYPOINT ["java", "-jar", "app/backend-1.0-SNAPSHOT.jar"]