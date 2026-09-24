pipeline {
    agent {
        label 'centos-latest'
    }

    tools {
        maven 'apache-maven-latest'
        jdk 'openjdk-jdk11-latest'
    }

    options {
        timestamps()
        timeout(time: 120, unit: 'MINUTES')
    }

    stages {
        stage('Build and test') {
            steps {
                script {
                    // The reactor includes SWT-based tests, which require an X display.
                    wrap([$class: 'Xvnc', takeScreenshot: true, useXauthority: true]) {
                        sh '''
                            mvn -B -f releng/org.eclipse.eef.releng/pom.xml clean verify
                        '''
                    }
                }
            }
            post {
                always {
                    junit(
                        allowEmptyResults: true,
                        testResults: '**/target/surefire-reports/*.xml'
                    )
                    archiveArtifacts(
                        artifacts: '**/target/work/data/.metadata/.log,**/target/work/data/.metadata/*log',
                        allowEmptyArchive: true
                    )
                }
            }
        }
    }
}
