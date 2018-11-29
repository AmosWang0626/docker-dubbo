package com.amos.provider.response;

import java.io.Serializable;

/**
 * PROJECT: dubbo-provider
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/11/29
 */
public class HelloVO implements Serializable {

    private static final long serialVersionUID = -1710555288544410808L;

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
