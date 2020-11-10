
def call() {
	println "Hej"
	archiveArtifacts artifacts: '**/*.log', fingerprint: true
}


