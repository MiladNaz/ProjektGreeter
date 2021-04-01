FROM openjdk:11-jre-slim-buster
EXPOSE 8080
COPY ./target/*jar-with-dependencies.jar /ProjektGreeter.jar

CMD ["java" , "-jar" , "/ProjektGreeter.jar"]