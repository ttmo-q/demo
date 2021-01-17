package com.ttmoq.demoprovider.service.impl;

import com.ttmoq.demoprovider.api.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * TODO
 *
 * @author Jover Zhang
 */
@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
