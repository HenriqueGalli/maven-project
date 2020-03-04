pipeline {
    agent any
    stages{
        stage('Build'){
            steps {
                bat 'mvn clean package'
            }
            post {
                success {
                    echo 'Now Archiving....'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }            
        }
        stage('Deploy to Staging'){
            steps{
                build job: 'deploy-to-staging 1'
            }   
        } 
        stage('Deploy to Prod'){
            steps{
                timeout(time:5,unit:'DAYS'){
                    input message: 'Approve PRODUCTION Deployment?'
                }
                build job: 'deploy-to-prod'
            }  
            post{
                success{
                    echo 'Code deployed to production!'
                }
                failure{
                    echo 'Deployment failed.'
                }
            }
        }  

    }
}
