pipelineJob('my-job2') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/sahumahesh0512/jobDSL2.git')
                    }
                    branches('*/main') // Configure the branch patterns to build
                    scriptPath('job1-java') // Specify the location of the Jenkinsfile in your repository
                    scriptPath('job2-javascript')
                    scriptPath('job2-javascript')
                    scriptPath('job3-Ruby')
                }
            }
        }
    }
}
