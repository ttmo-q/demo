package com.ttmoq.democonsumer.controller;

import com.ttmoq.demoprovider.api.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Jover Zhang
 */
@RestController
public class DemoController {

    @DubboReference
    DemoService demoService;


    @GetMapping
    public String sayHello(String name) {
        return demoService.sayHello(name);
    }

}
