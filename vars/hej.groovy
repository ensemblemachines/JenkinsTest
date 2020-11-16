
def call() {
	println "Hej"
	sh("ls")
	archiveArtifacts artifacts: '**', fingerprint: true
}


