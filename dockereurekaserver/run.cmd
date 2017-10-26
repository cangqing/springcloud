mvn clean package docker:build
docker run --name dockereurekaserver -p 8761:8761 -t wennaisong/dockereurekaserver