package com.amos.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.amos.provider.dubbo.DubboHelloBusiness;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PROJECT: consumer
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/11/29
 */
@RestController
public class HelloController {

    @Reference
    private DubboHelloBusiness dubboHelloBusiness;

    @RequestMapping("hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return dubboHelloBusiness.sayHello(name);
    }

}
