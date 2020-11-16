
def call() {
	println "Hej"
	sh("pytest -v --alluredir /allure-results")
	//archiveArtifacts artifacts: '**', fingerprint: true
}


