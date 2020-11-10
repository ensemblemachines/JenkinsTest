
def call() {
	println "Hej"
	archiveArtifacts artifacts: '**', fingerprint: true
}


