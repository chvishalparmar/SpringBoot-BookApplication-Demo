# Use a base image with Java installed
FROM adoptopenjdk/openjdk11:alpine

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container at /app
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar

# Specify the command to run your application
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
