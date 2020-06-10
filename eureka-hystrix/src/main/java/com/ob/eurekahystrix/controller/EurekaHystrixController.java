package com.ob.eurekahystrix.controller;

import com.ob.eurekahystrix.service.EurekaHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: oubin
 * @Date: 2020/6/10 09:22
 * @Description:
 */
@RestController
@RequestMapping("/v1.0")
public class EurekaHystrixController {

    @Autowired
    private EurekaHystrixService hystrixService;

    @RequestMapping(value = "/hystrix")
    public String rpcHystrix() {
        return hystrixService.rpcHystrix();
    }
}
