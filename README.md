# My Container

## Introduction

This repository contains the code for building a container using Docker.

## Prerequisites

* Docker installed on your machine
* GitHub repository with the application code
* DockerHub Account 

## Building the Docker Image

1. Create a Dockerfile in the root of the repository
2. Write Dockerfile instructions to build the container
3. Create a .dockerignore file to exclude unnecessary files
4. Build the container using `docker build -t springboot-bookapplication-demo https://github.com/chvishalparmar/SpringBoot-BookApplication-Demo.git`

## Runing the Container 

1. Run Container using `docker run -d -p 9999:9999 --name spring-boot-container springboot-bookapplication-demo`

## Pushing the Container to Docker Hub

1. Create a Docker Hub account
2. Login to Docker Hub using `docker login`
3. Tag the image with the desired repository name on Docker Hub: `docker tag springboot-bookapplication-demo <username>/springboot-bookapplication-demo:latest`
4. Push the container using `docker push <username>/springboot-bookapplication-demo`


## Usage

1. Pull the container from Docker Hub using `docker pull springboot-bookapplication-demo`
2. Run the container using `docker run springboot-bookapplication-demo`
