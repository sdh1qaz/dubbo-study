
#dubbo是一个分布式服务框架
#dubbo是一个高性能的RPC调用框架
#我们常常使用springboot来暴露http服务




#Zookeeper是一个服务注册中心，是Apache的子项目
#一个分布式的开源的分布式应用程序协调服务。踏实一个为分布式应用提供一致性服务的软件
#功能有：配置维护，域名服务，分布式同步等
#zk需要在本地安装


#springboot集成dubbo参考：
#  https://www.imooc.com/article/44576

#引入spring-boot-start-dubboy依赖，这个依赖已包含zk-client依赖
<dependency>
    <groupId>io.dubbo.springboot</groupId>
    <artifactId>spring-boot-starter-dubbo</artifactId>
    <version>1.0.0</version>
</dependency>


#定义一个HelloService的接口，编写HelloServiceImpl的实现类，加上dubbo的@service注解，
#到这里dubbo的服务提供者已经创建完成




