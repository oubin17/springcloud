package com.ob.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: oubin
 * @Date: 2020/6/9 15:46
 * @Description:
 */
@RestController
@RequestMapping(value = "/v1.0")
public class EurekaClientController {

    @GetMapping(value = "/client")
    public String client() {
        return "eureka client start!";
    }

}
