FROM java:latest
EXPOSE 8080
COPY ./target/ProjektGreeter-1.0-SNAPSHOT.jar $DEPLOY_DIR