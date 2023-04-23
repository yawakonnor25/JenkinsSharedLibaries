def call(String StageName){
    if ("${StageName}" == "Build") {
        sh "mvn clean package"
    }
    else if ("${StageName}" == "SonarQube Report") {
        sh "mvn sonar:sonar"
    }
    else if ("${StageName}" == "Upload to Nexus") {
        sh "mvn deploy"
    }

}          