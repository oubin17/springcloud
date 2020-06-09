package com.ob.eurekaribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: oubin
 * @Date: 2020/6/9 16:29
 * @Description:
 */
@Service
public class EurekaRibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String loadBalance() {
        String url = "http://eureka-client/v1.0/load_balance";
        return restTemplate.getForObject(url, String.class);
    }
}
