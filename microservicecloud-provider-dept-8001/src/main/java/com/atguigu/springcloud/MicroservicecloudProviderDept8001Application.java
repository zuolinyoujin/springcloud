package com.atguigu.springcloud;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@EnableCircuitBreaker//对hystrixR熔断机制的支持
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@MapperScan(basePackages = "com.atguigu.springcloud.dao")
@SpringBootApplication
public class MicroservicecloudProviderDept8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudProviderDept8001Application.class, args);
    }
}
