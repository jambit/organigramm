pipeline {
  agent any
  stages {
  stage('clean') {
    steps {
       sh "chmod +x gradlew"
       sh "./gradlew clean"
    }
  }
    stage('build') {
        steps {
            sh "./gradlew build"
        }
    }
    stage('SonarQube analysis') {
      steps {
        script {
          scannerHome = tool 'SonarQubeScanner'
        }
        withSonarQubeEnv('Sonar') {
          sh "${scannerHome}/bin/sonar-scanner"
        }
      }
    }
  }
}