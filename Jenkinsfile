// docker集成docker部署
pipeline {
    agent {label 'master'}
    tools{
        maven 'MAVEN'
    }

    environment {
        GIT_PROJECT_ADDR="https://github.com/yutou1064/ST.git" //项目的git地址
        JENKINS_WORKSPACE="/var/lib/jenkins/workspace"    //jenkins存放文件的地址
        PROJECT_NAME="ST"  			        // 项目名
        JAR_NAME="ST.war"   // 项目生成的jar的名字
        IMAGE_NAME="ST"                    // 镜像名一般和项目名相同
        IMAGE_ADDR="192.168.56.12/${IMAGE_NAME}"    // 镜像的位置
        VERSION_ID="${BUILD_ID}"
    }
    stages {
        stage('pullCode'){
            steps{
                echo 'This is a pullCode step'
                //git branch: "${BRANCH}", credentialsId: '1001', url: "${GIT_PROJECT_ADDR}"
                checkout scm
            }
        }
        stage('Build') {
            steps{
                echo 'This is a Build step'
                // 在有Jenkinsfile同一个目录下（项目的根目录下）
                sh 'mvn clean package -Dmaven.test.skip=true'
            }
        }
        // 创建目录(如果不存在)，并把jar文件上传到该目录下
        stage('ssh') {
            steps{
                echo 'push war to target server'
                sh '''
                    ole_image_id=`docker images|grep ${IMAGE_NAME}|grep ${VERSION_ID}|awk '{print $3}'`
                    if [[ -n "${ole_image_id}" ]]; then
                        docker rmi -f ${ole_image_id}
                    fi
                    
                    docker build -f Dockerfile --build-arg jar_name=${JAR_NAME} -t ${IMAGE_NAME}:${VERSION_ID} .
                    
                    new_image_id=`docker images|grep ${IMAGE_NAME}|grep ${VERSION_ID}|awk '{print $3}'`
                    sudo docker tag ${new_image_id} ${IMAGE_ADDR}:${VERSION_ID}
                    sudo docker push ${IMAGE_ADDR}:${VERSION_ID}
                '''
            }
        }
        stage('run') {
            // 在应用服务器节点 test
            agent {
                node {
                    label 'test'
                    //customWorkspace "${SER
