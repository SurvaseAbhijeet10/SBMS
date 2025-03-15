# Use an official OpenJDK runtime as base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/Demo_Project-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that Spring Boot runs on
EXPOSE 8082

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

