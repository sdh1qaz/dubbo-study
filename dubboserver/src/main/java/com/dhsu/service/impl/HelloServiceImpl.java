package com.dhsu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dhsu.service.HelloService;

/**
 * @ClassName： HelloServiceImpl
 * @Author: dhSu
 * @Description:
 * @Date:Created in 2018年11月10日
 */
@Service(version="1.0.0")
public class HelloServiceImpl implements HelloService{
	
	public String sayHello(String name) {
		return "hello " + name;
	}

}
