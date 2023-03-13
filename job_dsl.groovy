library 'jenkins.jobdsl.core.dsl'
library 'jenkins.jobdsl.dsl.helpers.publisher'

pipelineJob('my-pipeline-job') {
    definition {
        cps {
            script('''
                pipeline {
                    agent any
                    stages {
                        stage('one') {
                            steps {
                                shell('df')
                            }
                            steps{
                                shell('echo "Hello dear $NAME!"
                                      date
                                      echo "This is your DDoS number $BUILD_NUMBER."')
                            }
                        }
                    }
                }
            ''')
        }
    }
}