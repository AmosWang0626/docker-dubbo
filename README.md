# Dubbo Provider
> spring boot stater project

- 当前项目主页：[docker-dubbo](https://amoswang0626.github.io/docker-dubbo/)
- 温馨提示：_blank方式打开链接，请按住Ctrl键


## docker 构建 zookeeper集群、dubbo-admin 环境
  - [docker-compose.yml](docker-compose.yml)
  - docker-compose up -d
  - 访问dubbo-admin [http://localhost:8080/](http://localhost:8080/)
    - root用户：账号密码均为root
    - guest用户：账号密码均为guest

## 测试 dubbo 消费者调用生产者
- sayHello [http://localhost:8081/hello/amos](http://localhost:8081/hello/amos)

## 注意事项
- 不删除旧镜像，再次构建，旧镜像就会被悬空
  - 删除悬空镜像：docker image prune
- 删除构建的 zookeeper、dubbo-admin、network
  - 停止：docker stop dubbo-admin zookeeper_3 zookeeper_2 zookeeper_1
  - 删除：docker rm dubbo-admin zookeeper_3 zookeeper_2 zookeeper_1
  - 删除网络：docker network rm dubbo-net
