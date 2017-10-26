mvn clean package docker:build
docker run --link dockereurekaserver -p 8763:8763 -t wennaisong/dockereurakaregister