
def call() {
	println "Hej"
	sh("cd vars")
	sh("ls")
	archiveArtifacts artifacts: '**', fingerprint: true
}


