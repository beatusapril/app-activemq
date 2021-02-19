FROM openjdk:8-alpine
ADD ./build/libs/activemq-5.0.7-SNAPSHOT.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]