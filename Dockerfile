FROM 192.168.56.12/myjdk8:v1

# 默认jar包的名字 注意分隔符为 :-  这里是由jenkinsfile中build dockerfile时传递过来的
ARG jar_name={jar_name:ST.war}

# RUN 用于容器内部执行命令
RUN mkdir -p /usr/local/project
WORKDIR /usr/local/project


# 将项目放到/usr/local/project下
COPY ./target/ST.war ./

EXPOSE 8081

CMD java -jar -Dserver.port=8081 ST.war
