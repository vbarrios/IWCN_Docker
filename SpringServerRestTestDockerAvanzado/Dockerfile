FROM java:8
MAINTAINER Victor Barrios Gonzalez
EXPOSE 8080
VOLUME /tmp
ADD /target/SpringServerRestTestDockerAvanzado-0.0.1-SNAPSHOT.jar practicavictor.jar
ENTRYPOINT ["java", "-jar", "practicavictor.jar"]