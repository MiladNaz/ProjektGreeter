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
        stage('Test'){
            steps{
                sh 'mvn test'
            }
        }
        stage('Pack to JAR'){
            steps{
                sh 'mvn package'
            }
        }
        stage('Run JAR file'){
            steps{
                sh 'java -jar ./target/ProjektGreeter-1.0-SNAPSHOT.jar'
            }
        }
    }
}