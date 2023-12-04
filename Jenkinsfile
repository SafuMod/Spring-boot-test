pipeline{
  agent any

  stages {
      stage("Build") {
        
          steps {
            echo "Building the Java Application"
            withMaven() {
              sh "mvn clean verify"
            }
          }
        
      }

  }

}
