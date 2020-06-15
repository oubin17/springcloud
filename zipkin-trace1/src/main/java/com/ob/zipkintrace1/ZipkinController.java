package com.ob.zipkintrace1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @Author: oubin
 * @Date: 2020/6/15 16:50
 * @Description:
 */
@RestController
@RequestMapping(value = "/v1.0/zipkin")
public class ZipkinController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/trace-1", method = RequestMethod.GET)
    public String trace() {
        logger.info("===call trace-1===");
        return restTemplate.getForEntity("http://zipkin-trace2/v1.0/zipkin/trace-2", String.class).getBody();
    }
}
