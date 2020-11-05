pipeline {
  agent any
  stages {
    stage('Stage 1') {
      steps {
        sh '''def browsers = [\'chrome\', \'firefox\']
for (int i = 0; i < browsers.size(); ++i) {
  echo "Testing the ${browsers[i]} browser"
}'''
      }
    }

  }
}