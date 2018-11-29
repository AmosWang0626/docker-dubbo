# Dubbo Consumer
> spring boot stater project


## docker 打包 & 启动
- 构建镜像: mvn package
- 查看镜像: docker images
- 运行项目: docker run -d -p 8081:8081 --name consumer --network dubbo-net consumer
- 查看实时日志：docker logs -f consumer
