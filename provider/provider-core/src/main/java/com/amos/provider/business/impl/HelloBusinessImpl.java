package com.amos.provider.business.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.amos.provider.business.HelloBusiness;
import com.amos.provider.dubbo.DubboHelloBusiness;
import org.springframework.stereotype.Component;

/**
 * PROJECT: dubbo-provider
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/11/29
 */
@Service(interfaceClass = DubboHelloBusiness.class)
@Component("helloBusiness")
public class HelloBusinessImpl implements HelloBusiness {

    @Override
    public String sayHello(String name) {
        System.out.println("==================================");
        System.out.println("provider say hello to " + name);
        System.out.println("==================================");
        return "Congratulations! " + name + ", You're awesome!";
    }
}
