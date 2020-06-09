package com.ob.eurekaribbon.controller;

import com.ob.eurekaribbon.service.EurekaRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: oubin
 * @Date: 2020/6/9 16:29
 * @Description:
 */
@RestController
@RequestMapping(value = "/v1.0")
public class EurekaRibbonController {

    @Autowired
    private EurekaRibbonService eurekaRibbonService;

    @GetMapping(value = "/ribbon_balance")
    public String ribbon() {
        return eurekaRibbonService.loadBalance();
    }

}
