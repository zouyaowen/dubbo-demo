package com.zou.demo.runner;

import com.zou.demo.api.biz.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Author: zouyaowen
 * @Description:
 * @Date: 0:36 2020/1/2
 * @Modifyed by:
 */
@Component
public class SystemRunner implements CommandLineRunner {

    @Reference
    private IHelloService helloService;

    @Override
    public void run(String... args) throws Exception {
        String hello = helloService.sayHello("邹耀文");
        System.out.println(hello);
    }
}
