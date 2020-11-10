
def call() {
	println "Hej"
	archiveArtifacts artifacts: '/var/log/jenkins/jenkins.log', fingerprint: true
}

