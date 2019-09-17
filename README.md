# Docker Dubbo
> spring boot stater project

## 项目介绍
> 本项目旨在应用阿里开源的分布式服务框架 [dubbo](http://dubbo.apache.org/zh-cn/)

- 主要内容包括
  - docker 构建 zookeeper 集群
  - docker 构建 dubbo-admin（服务管理后台）
  - docker 构建 服务API [provider-api](provider-api)
  - docker 构建 服务提供者 [provider](provider)
  - docker 构建 服务消费者 [consumer](consumer)

- 项目主页：[docker-dubbo](https://amoswang0626.github.io/docker-dubbo/)
- 温馨提示：_blank方式打开链接，请按住Ctrl键


## docker构建zookeeper集群、dubbo-admin
  - dubbo-admin 镜像说明
    - master 分支使用 `apache/dubbo-admin`
    - chuxin 分支使用 `chenchuxin/dubbo-admin`
  - [docker-compose.yml](docker-compose.yml)
  - docker-compose up -d
  - 访问dubbo-admin [http://localhost:8080/](http://localhost:8080/)

## 注意事项
- 不删除旧镜像，再次构建，旧镜像就会被悬空
  - 删除悬空镜像：docker image prune
- 删除构建的 zookeeper、dubbo-admin、network
  - 停止：docker stop dubbo zk1 zk2 zk3
  - 删除：docker rm dubbo zk1 zk2 zk3
  - 删除网络：docker network rm dubbo-net

### 元数据配置问题参考
- [dubbo-admin/issues/342](https://github.com/apache/dubbo-admin/issues/342)
- [Dubbo Admin配置说明](https://github.com/apache/dubbo-admin/wiki/Dubbo-Admin-configuration)
