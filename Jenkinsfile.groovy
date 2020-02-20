node {
    stage("Say Hello"){
        properties([pipelineTriggers([cron('H/10 * * * *')])])
        sh "echo Hello"
    }
}