package com.ob.eurekaconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class EurekaConfigApplication {

    /**
     * http://localhost:1010/info.profile/dev
     * eureka-config-dev.yml  key:info.profile
     * 映射关系：
     * /{application}/{profile}[/{label}]
     * /{application}-{profile}.yml
     * /{label}/{application}-{profile}.yml
     * /{application}-{profile}.properties
     * /{label}/{application}-{profile}.properties
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigApplication.class, args);
    }

}
