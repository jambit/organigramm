pipeline {
  agent any
  stages {
  stage('clean') {
    steps {
       sh "chmod +x gradlew"
       sh "./gradlew clean"
    }
  }
    stage('Unit & Integration test') {
        steps {
            sh "./gradlew build test"
        }
    }
    stage('SonarQube') {
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