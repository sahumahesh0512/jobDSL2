// Create a folder named "JOBDSL"
folder('JOBDSL') {
    displayName('JOBDSL')

    // Define pipeline jobs inside the folder
    pipelineJob('JOBDSL/job1-java') {
        displayName('Job 1 - Java')
        definition {
            cpsScm {
                scm {
                    git {
                        remote {
                            url('https://github.com/sahumahesh0512/jobDSL2.git')
                        }
                        branches('*/main')
                        scriptPath('job1-java') // Path to Jenkinsfile in the repository
                    }
                }
            }
        }
    }

    pipelineJob('JOBDSL/job2-javascript') {
        displayName('Job 2 - JavaScript')
        definition {
            cpsScm {
                scm {
                    git {
                        remote {
                            url('https://github.com/sahumahesh0512/jobDSL2.git')
                        }
                        branches('*/main')
                        scriptPath('job2-javascript') // Path to Jenkinsfile in the repository
                    }
                }
            }
        }
    }

    pipelineJob('JOBDSL/job3-Ruby') {
        displayName('Job 3 - Ruby')
        definition {
            cpsScm {
                scm {
                    git {
                        remote {
                            url('https://github.com/sahumahesh0512/jobDSL2.git')
                        }
                        branches('*/main')
                        scriptPath('job3-Ruby') // Path to Jenkinsfile in the repository
                    }
                }
            }
        }
    }
}
