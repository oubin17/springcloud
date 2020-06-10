package com.ob.eurekafeign.impl;

import com.ob.eurekafeign.interfaces.IEurekaFeign;
import org.springframework.stereotype.Component;

/**
 * @Author: oubin
 * @Date: 2020/6/10 09:57
 * @Description: feign自带的断路器，当请求无法调用的时候会执行断路器的方法
 */
@Component
public class EurekaFeignImpl implements IEurekaFeign {

    @Override
    public String rpcEurekaClient() {
        return "remote procedure call fail!";
    }
}
