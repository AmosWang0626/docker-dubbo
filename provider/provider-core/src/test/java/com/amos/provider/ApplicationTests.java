package com.amos.provider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Value("${dubbo.registry.address}")
    private String dubboRegistryAddress;

    @Test
    public void contextLoads() {
        System.out.println(dubboRegistryAddress);
    }

}
