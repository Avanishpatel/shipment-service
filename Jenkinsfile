pipeline {
    agent any
    // { label 'master' }
    stages {
       stage('Build') {
          steps {
             sh 'gradle clean compileJava'
             sh './gradlew clean build'
          }
       }
       stage('Deploy'){
           steps{
               sh 'cf push shipment-service -p ./build/libs/shipment-service-0.0.1-SNAPSHOT.jar --no-start --random-route'
           }
       }
    }
}