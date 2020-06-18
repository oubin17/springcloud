package com.ob.eurekaconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: oubin
 * @Date: 2020/6/12 14:24
 * @Description: 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
 */
@RefreshScope
@RestController
@RequestMapping("/v1.0")
public class EurekaConfigClientController {

    @Value("${info.profile}")
    private String profile;

    @RequestMapping("/config/client")
    public String from() {
        return this.profile;
    }
}
