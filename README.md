# My Container

## Introduction

This repository contains the code for building a container using Docker.

## Prerequisites

* Docker installed on your machine
* GitHub repository with the application code

## Building the Container

1. Create a Dockerfile in the root of the repository
2. Write Dockerfile instructions to build the container
3. Create a .dockerignore file to exclude unnecessary files
4. Build the container using `docker build -t myimage https://github.com/chvishalparmar/SpringBoot-BookApplication-Demo.git`

## Pushing the Container to Docker Hub

1. Create a Docker Hub account
2. Login to Docker Hub using `docker login`
3. Push the container using `docker push myimage`


## Usage

1. Pull the container from Docker Hub using `docker pull myimage`
2. Run the container using `docker run myimage`
