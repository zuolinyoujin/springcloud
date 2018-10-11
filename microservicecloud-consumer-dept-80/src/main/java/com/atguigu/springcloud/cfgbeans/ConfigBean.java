package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author shkstart
 * @create 2018-10-08 下午 9:43
 */

@Configuration
public class ConfigBean {

    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

}
