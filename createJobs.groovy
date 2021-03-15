pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('pako-backend-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/MaxxPako/pako-backend.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}