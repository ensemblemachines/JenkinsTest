
def call() {
	println "Hej"
	sh("pwd")
	archiveArtifacts artifacts: '**', fingerprint: true
}


