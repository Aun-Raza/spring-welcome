pipeline {
    agent any
    tools {
        maven "MAVEN"
        jdk "JDK19"
    }
    stages {
        stage("Build") {
            steps {
                sh "mvn clean compile"
            }
        }
    }
}