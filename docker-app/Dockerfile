# Use an official OpenJDK runtime as base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container's WORKDIR
COPY target/docker-app.jar app.jar

# Expose the port that Spring Boot runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "docker-app.jar"]
