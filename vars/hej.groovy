
def call() {
	println "Hej"
	sh("pytest -v --alluredir .")
	//archiveArtifacts artifacts: '**', fingerprint: true
}


