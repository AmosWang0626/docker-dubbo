# Docker Dubbo
> spring boot stater project

## 项目介绍
> 本项目旨在应用阿里开源的分布式服务框架 [dubbo](http://dubbo.apache.org/zh-cn/)

- 主要内容包括
  - docker 构建 zookeeper 集群
  - docker 构建 dubbo-admin（服务管理后台）
  - docker 构建 服务提供者 [provider](provider)
  - docker 构建 服务消费者 [consumer](consumer)

- 项目主页：[docker-dubbo](https://amoswang0626.github.io/docker-dubbo/)
- 温馨提示：_blank方式打开链接，请按住Ctrl键


## docker 构建 zookeeper 集群、dubbo-admin
  - [docker-compose.yml](docker-compose.yml)
  - docker-compose up -d
  - 访问dubbo-admin [http://localhost:8080/](http://localhost:8080/)
    - root用户：账号密码均为root
    - guest用户：账号密码均为guest

## 注意事项
- 不删除旧镜像，再次构建，旧镜像就会被悬空
  - 删除悬空镜像：docker image prune
- 删除构建的 zookeeper、dubbo-admin、network
  - 停止：docker stop dubbo-admin zookeeper_3 zookeeper_2 zookeeper_1
  - 删除：docker rm dubbo-admin zookeeper_3 zookeeper_2 zookeeper_1
  - 删除网络：docker network rm dubbo-net

## 致敬
> 本分支致敬第一个dubbo-admin镜像[chenchuxin/dubbo-admin](https://github.com/chenchuxin/dubbo-admin-docker)
