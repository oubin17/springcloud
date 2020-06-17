package com.ob.zipkintrace2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: oubin
 * @Date: 2020/6/15 16:57
 * @Description:
 */
@RestController
@RequestMapping(value = "/v1.0/zipkin")
public class ZipkinController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/trace-2", method = RequestMethod.GET)
    public String trace() {
        logger.info("===call trace-2===");
        return "Trace";
    }
}
