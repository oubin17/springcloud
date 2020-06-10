package com.ob.eurekafeign.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: oubin
 * @Date: 2020/6/10 08:51
 * @Description:
 */
@FeignClient(value = "eureka-client")
public interface IEurekaFeign {

    /**
     * 远程调用eureka-client接口
     *
     * @return
     */
    @RequestMapping(value = "/v1.0/load_balance", method = RequestMethod.GET)
    String rpcEurekaClient();
}
