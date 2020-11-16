
def call() {
	println "Hej"
	sh("pytest -v --alluredir .")
	allure includeProperties: false, jdk: '', results: [[path: '**']]
	//archiveArtifacts artifacts: '**', fingerprint: true
}


