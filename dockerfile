# Use a base image with Java installed
FROM adoptopenjdk/openjdk11:alpine

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container at /app
COPY target/SpringBoot-BookApplication-Demo.jar /app/SpringBoot-BookApplication-Demo.jar

# Specify the command to run your application
CMD ["java", "-jar", "SpringBoot-BookApplication-Demo.jar"]
