# Dubbo Provider
> spring boot stater project


## 构建 zookeeper、dubbo-admin 环境
  - [docker-compose.yml](docker-compose.yml)
  - docker-compose up -d
  - 访问dubbo-admin [http://localhost:8080/](http://localhost:8080/)
    - root用户：账号密码均为root
    - guest用户：账号密码均为guest


## 注意事项
- 如果不删除旧镜像，第二次构建完，第一次构建的镜像就会悬空
  - 删除悬空镜像：docker image prune
- 删除构建的 zookeeper、dubbo-admin、network
  - 停止：docker stop dubbo-admin zookeeper_3 zookeeper_2 zookeeper_1
  - 删除：docker rm dubbo-admin zookeeper_3 zookeeper_2 zookeeper_1
  - 删除网络：docker network rm dubbo-net
