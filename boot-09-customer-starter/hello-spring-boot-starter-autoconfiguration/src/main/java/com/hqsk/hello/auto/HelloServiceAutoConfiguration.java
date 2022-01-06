package com.hqsk.hello.auto;

import com.hqsk.hello.bean.HelloProperties;
import com.hqsk.hello.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//开启属性文件绑定  默认HelloProperties放在容器中
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfiguration {
    @ConditionalOnMissingBean(HelloService.class)
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }

}
