FROM openjdk:12-alpine
EXPOSE 8080
COPY ./target/*jar-with-dependencies.jar /ProjektGreeter.jar

CMD ["java" , "-jar" , "/ProjektGreeter.jar"]