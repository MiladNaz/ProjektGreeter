pipeline{
    agent any

    tools{
        maven 'Maven 3.6.3'
        jdk 'JDK_16'
    }
    stages{
        stage('Build'){
            steps{
                sh 'java --version'
                sh 'mvn clean compile'
            }
        }
        stage('Unit Tests'){
            steps{
                sh 'mvn test'
            }
        }
        stage('Pack to JAR'){
            steps{
                sh 'mvn package'
            }
            post {
                success {
                    sh 'rm ./target/ProjektGreeter-1.1-SNAPSHOT.jar'
                    archiveArtifacts 'target/*jar-with-dependencies.jar'
                }
            }
        }
        stage('Run JAR file'){
            steps{
                sh 'java -jar ./target/*jar-with-dependencies.jar'
            }
        }
        stage('Create docker image') {
            steps {
                sh 'docker build -t miladnazarii/projektgreeter:1.1 .'
            }
        }
        stage('Push image to docker hub'){
            steps{
                withDockerRegistry([credentialsId: "DockerLogin", url: ""]){
                    sh 'docker push miladnazarii/projektgreeter:1.1'
                }
            }
        }
    }
}