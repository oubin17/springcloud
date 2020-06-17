package com.ob.eurekaconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConfigClientApplication {

    /**
     * 通过config服务端获取配置文件的时候，远端需要存在对应的文件：name=eureka-config-client, profiles=[dev], label=master
     * 否则获取失败
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigClientApplication.class, args);
    }

}
