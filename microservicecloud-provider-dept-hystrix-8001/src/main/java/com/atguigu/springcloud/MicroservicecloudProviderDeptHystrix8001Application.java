package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.atguigu.springcloud.dao")
@EnableCircuitBreaker //对hystrixR熔断机制的支持
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
public class MicroservicecloudProviderDeptHystrix8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudProviderDeptHystrix8001Application.class, args);
    }
}
