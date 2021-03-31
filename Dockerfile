FROM openjdk:12-alpine
EXPOSE 8080
COPY ./target/ProjektGreeter-1.0-SNAPSHOT-jar-with-dependencies.jar /ProjektGreeter.jar

CMD ["java" , "-jar" , "/ProjektGreeter.jar"]