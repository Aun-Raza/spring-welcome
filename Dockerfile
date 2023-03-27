FROM openjdk:19
ADD welcome-page-0.0.1-SNAPSHOT.jar welcome-page-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "welcome-page-0.0.1-SNAPSHOT.jar"]