FROM wennaisong/javaweb
VOLUME /tmp
ADD target/dockereurakaregister-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8761