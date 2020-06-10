package com.ob.eurekafeign.controller;

import com.ob.eurekafeign.interfaces.IEurekaFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: oubin
 * @Date: 2020/6/10 08:50
 * @Description:
 */
@RestController
@RequestMapping("/v1.0/feign")
public class EurekaFeignController {

    @Autowired
    private IEurekaFeign iEurekaFeign;

    @GetMapping
    public String feign() {
        return iEurekaFeign.rpcEurekaClient();
    }


}
