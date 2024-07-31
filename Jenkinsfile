pipeline {
    agent any
 
    stages {
        stage('Git Code Clone') {
            steps {
                echo 'My first step code clone from GitHub'
                git branch: 'main', url: 'https://github.com/nikunjdevcloud/simple-java-docker-app.git'
            }
        }
         stage('Build Image') {
            steps {
                echo 'My Image build going on..'
                echo "${USER}  ---  $USER"
                sh 'docker build -t java-app:jenkins .'
            }
        }
         stage('Deploy Build') {
            steps {
                echo 'My Deployment..'
                sh 'docker run -d --name Java_App java-app:jenkins'
            }
        }
    }
}
