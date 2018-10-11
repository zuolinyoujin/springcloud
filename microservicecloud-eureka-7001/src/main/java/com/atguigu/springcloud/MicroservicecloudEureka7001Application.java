package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer  //EurekaServer服务器端启动类,接受其它微服务注册进来@EnableEurekaServer//EurekaServer服务器端启动类,接受其它微服务注册进来
@SpringBootApplication
public class MicroservicecloudEureka7001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudEureka7001Application.class, args);
    }
}
