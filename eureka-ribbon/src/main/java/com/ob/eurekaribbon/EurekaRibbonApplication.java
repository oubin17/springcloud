package com.ob.eurekaribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableHystrix
@EnableHystrixDashboard
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRibbonApplication.class, args);
    }

    /**
     * 如果要测试负载均衡，只需要启动多个实例，通过restTemplate访问接口，打印出实例的端口。
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
