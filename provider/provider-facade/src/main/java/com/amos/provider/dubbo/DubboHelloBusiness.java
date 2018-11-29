package com.amos.provider.dubbo;

/**
 * PROJECT: dubbo-provider
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/11/29
 */
public interface DubboHelloBusiness {

    /**
     * say hello
     *
     * @param name name
     * @return hello + name
     */
    String sayHello(String name);
}
