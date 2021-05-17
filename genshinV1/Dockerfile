FROM openjdk:8-jdk-alpine
RUN addgroup -S webapp && adduser -S genshinV1 -G webapp
USER genshinV1:webapp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]