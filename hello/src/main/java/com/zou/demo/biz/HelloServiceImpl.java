package com.zou.demo.biz;

import com.zou.demo.api.biz.IHelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author: zouyaowen
 * @Description:
 * @Date: 0:35 2019/12/20
 * @Modifyed by:
 */
@Service
public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHello(String userName) {
        return "hello " + userName;
    }
}
