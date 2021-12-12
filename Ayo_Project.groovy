job('Jenkins_Docker'){
	scm{
		git("https://github.com/tmatthysen/maven-samples-master.git", 'main')
	}
	triggers{
		scm('15 * * * *')
	}
	stage('Build')
	{
		steps{
			sh 'mvn clean package'
		}
	}
}