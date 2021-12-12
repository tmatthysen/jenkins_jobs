job('Jenkins_Docker'){
	scm{
		git("https://github.com/tmatthysen/project_java.git", 'master')
	}
	triggers{
		scm('15 * * * *')
	}
	stages
	{
		stage('Build')
		{
			steps{
				sh 'mvn clean package'
			}
		}
	}
}