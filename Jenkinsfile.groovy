node {
    stage("Say Hello"){
        properties([parameters([string(defaultValue: 'altynai', description: 'Paste your name', name: 'NAME', trim: true)]), 
        pipelineTriggers([cron('H/10 * * * *')])])
        sh "echo Hello ${NAME}"
    }
}