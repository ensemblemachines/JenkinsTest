
def call() {
	println "Hej"
	sh("python3 /Users/henrikpersson/.jenkins/workspace/Pipeline Job@libs/JENKINS_TEST/vars/Pytest/test_capitalize.py")
	//archiveArtifacts artifacts: '**', fingerprint: true
}


