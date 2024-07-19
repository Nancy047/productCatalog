FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/openapi-spring-4.0.0.jar app.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "app.jar"]