#!groovy

stage "initial checkout"

node {
    git url: "https://github.com/codetojoy/jenkins2_sandbox.git"
}

stage "build"
node {
    def gradleHome = tool "G31"
    sh "${gradleHome}/bin/gradle clean test war -PBUILD_NUMBER=${env.BUILD_NUMBER}"
}

// -------------------------- DEV (auto-deploy)
stage "auto-deploy for DEV"
node {
    env.WORKSPACE = pwd() // See https://issues.jenkins-ci.org/browse/JENKINS-33511
    def ENV = "DEV"
    def SRC_DIR = "${env.WORKSPACE}/build/libs" 
    def DEST_DIR = "${env.WORKSPACE}/../../userContent/share"

    sh "${env.WORKSPACE}/resources/stage.sh $ENV ${env.BUILD_NUMBER} $SRC_DIR $DEST_DIR"
    sh "${env.WORKSPACE}/resources/deploy.sh $ENV ${env.BUILD_NUMBER}"
}

// -------------------------- run simple web test against DEV
