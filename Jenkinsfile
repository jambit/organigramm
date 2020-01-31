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
            post{
                failure {
                    script{
                        error "Failed, exiting now..."
                    }
                }
            }
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
        post{
            failure {
                script{
                    error "Failed, exiting now..."
                }
            }
        }
      }
    }
    stage('Deploy') {

    }
  }
}