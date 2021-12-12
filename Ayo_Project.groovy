job('Jenkins_Docker'){
	scm{
		git("https://github.com/tmatthysen/maven-samples-master.git", 'main')
	}
	triggers{
		scm('15 * * * *')
	}
	stages('Build')
	{
		steps{
			sh 'mvn clean package'
		}
	}
}