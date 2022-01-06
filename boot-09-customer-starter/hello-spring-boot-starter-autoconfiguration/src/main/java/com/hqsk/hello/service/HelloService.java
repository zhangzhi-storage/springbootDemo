package com.hqsk.hello.service;

import com.hqsk.hello.bean.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 默认不要放在容器中
 */
public class HelloService {
    @Autowired
    private HelloProperties helloProperties;
    public String sayHello(String userName){
        return helloProperties.getPrefix()+": "+userName+"》"+helloProperties.getSuffix();
    }
}
