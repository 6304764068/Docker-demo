FROM eclipse-temurin:17

LABEL maintainer="ashoklagadapati198@gmail.com"

WORKDIR /app

COPY target/Docker-demo-0.0.1-SNAPSHOT.jar /app/springboot-docker-demo.jar

ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]
