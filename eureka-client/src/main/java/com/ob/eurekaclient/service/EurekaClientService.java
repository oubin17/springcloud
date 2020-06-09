package com.ob.eurekaclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author: oubin
 * @Date: 2020/6/9 16:19
 * @Description:
 */
@Service
public class EurekaClientService {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;

    public String loadBalance() {
        return  "application.name: " + applicationName + " and port: " + port;

    }
}
