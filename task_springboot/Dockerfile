FROM amazoncorretto:24-alpine-jdk

WORKDIR /app

COPY target/task_springboot-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]