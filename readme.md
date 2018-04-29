
来源
> https://blog.csdn.net/forezp/article/details/70148833/

spring cloud 的 相关学习笔记

server 表明是一个 服务注册中心，类似zk 注册中心
启动一个服务注册中心，只需要一个注解@EnableEurekaServer
通过eureka.client.registerWithEureka：false和fetchRegistry：false来表明自己是一个eureka server.



client 表明是一个服务提供者, provider , 需要加上@EnableEurekaClient 主键，然后在application.yml 中 指定
在哪里注册服务。


ribbon  是一个 服务消费者。 customer 。 



Zuul  主要功能是路由转发和过滤器

config  使用配置服务来保存各个服务的配置文件,
  由于服务数量巨多，为了方便服务配置文件统一管理，实时更新，所以需要分布式配置中心组件。在Spring Cloud中，
  有分布式配置中心组件spring cloud config ，它支持配置服务放在配置服务的内存中（即本地），
  也支持放在远程Git仓库中。在spring cloud config 组件中，分两个角色，一是config server，二是config client。


