# 以java:8为基础镜像
FROM tomcat
MAINTAINER yutou
ADD target/ST.war /usr/local/tomcat/webapps
# 告诉 Docker 服务端容器暴露的端口号
EXPOSE 8888
CMD /usr/local/tomcat/bin/catalina.sh  run
