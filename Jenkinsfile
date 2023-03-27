pipeline {
    agent any

    tools {
        maven 'MAVEN'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Aun-Raza/spring-welcome.git'
            }
        }
        stage('Build Maven') {
            steps {
                script {
                    sh 'mvn clean install'
                }
            }
        }
        stage('Docker Build') {
            steps {
                script {
                    sh "docker build -t aunreza/maven_demo:${env.BUILD_ID} ."
                }
            }
        }
        stage('Docker Login') {
            steps {
                script {
                    withCredentials([usernamePassword(credentialsId: '4193ece9-7121-4dfc-9a68-74c8460c278a', passwordVariable: 'dockerhub_pwd', usernameVariable: 'dockerhub_usr')]) 
                    {
                    // some block
                        sh "docker login --username $dockerhub_usr --password $dockerhub_pwd"
                    }
                }
            }
        }
        stage("Docker Push") {
               steps {
                   script {
                            sh "docker push aunreza/maven_demo:${env.BUILD_ID}"
                         }
               }
          }
    }
}
