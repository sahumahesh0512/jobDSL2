folder name (JOBDSL){
display name (JOBDSL)
}
pipelineJob('JOBDSL/job1-java') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/sahumahesh0512/jobDSL2.git')
                    }
                    branches('*/main') // Configure the branch patterns to build
                    scriptPath('job1-java') // Specify the location of the Jenkinsfile in your repository
                }
            }
        }
    }
}
pipelineJob('JOBDSL/job2-javascript') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/sahumahesh0512/jobDSL2.git')
                    }
                    branches('*/main') // Configure the branch patterns to build
                    scriptPath('job2-javascript')   
                }
            }
        }
    }
}
pipelineJob('JOBDSL/job3-Ruby') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/sahumahesh0512/jobDSL2.git')
                    }
                    branches('*/main') // Configure the branch patterns to build
                    scriptPath('job3-Ruby')
                }
            }
        }
    }
}
