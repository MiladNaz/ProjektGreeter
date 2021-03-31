FROM java:latest
EXPOSE 8181
COPY ./target/ProjektGreeter-1.0-SNAPSHOT.jar $DEPLOY_DIR