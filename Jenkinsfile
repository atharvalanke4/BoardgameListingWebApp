pipeline {
    agent any
    
    tools {
        jdk "jdk11"
        maven "maven3"
    }
    
    stages {
        stage ("Git Checkout") {
            steps {
                git url: "https://github.com/pushkarshajapurkar/BoardgameListingWebApp.git" , branch: "master"
            }
        }
        
        stage ("Clean") {
            steps {
                sh "mvn clean"
            }
        }
        
        stage ("Compile") {
            steps {
                sh "mvn compile"
            }
        }
        
        stage ("Package") {
            steps {
                sh "mvn clean test package"
            }
        }
    }
    
}