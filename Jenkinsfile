//git凭证id
//def git_auth="1c59e957-b540-4cef-a9ed-1b7f1eb83902"
//def git_url="http://192.168.20.114:8099/xcyc/cloud-root.git"

//def git_auth="2037f0b1-e046-42e8-826e-278c8f575566"
//def git_url="https://github.com/agonn2017/natopnal_day.git"
node{
  def mvnHome
  stage('拉取代码'){
     //checkout([$class: 'GitSCM', branches: [[name: "*/${branch}"]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: "${git_auth}", url: "${git_url}"]]])
     checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '2037f0b1-e046-42e8-826e-278c8f575566', url: 'https://github.com/agonn2017/natopnal_day.git']]])
  }
 stage('代码审查'){
     //定义当前Jenkins的SonarQubeScanner工具
     def scannerHome = tool 'sonar-scanner'
     //引用当前JenkinsSonarQube环境
     withSonarQubeEnv('SonarQube'){
        sh '''
            cd ${project_name}
            /var/lib/jenkins/tools/hudson.plugins.sonar.SonarRunnerInstallation/sonar-scanner/bin/sonar-scanner
            //${scannerHome}/bin/sonar-scanner
        '''
     }
  }
 stage('项目部署'){
     echo '项目部署'
  }
}