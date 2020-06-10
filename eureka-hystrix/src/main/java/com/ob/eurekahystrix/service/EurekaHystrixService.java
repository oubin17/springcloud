package com.ob.eurekahystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: oubin
 * @Date: 2020/6/10 09:22
 * @Description:
 */
@Service
public class EurekaHystrixService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "rpcHystrixError")
    public String rpcHystrix() {
        return restTemplate.getForObject("http://eureka-client/v1.0/load_balance", String.class);
    }

    public String rpcHystrixError() {
        return "rpc error";
    }
}
