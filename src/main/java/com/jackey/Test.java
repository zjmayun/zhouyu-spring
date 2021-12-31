package com.jackey;

import com.spring.JackeyApplicationContext;
import com.jackey.service.OrderService;

public class Test {

    public static void main(String[] args) {
        JackeyApplicationContext applicationContext = new JackeyApplicationContext(AppConfig.class);
        OrderService orderService = (OrderService) applicationContext.getBean("orderService");
        orderService.test();

    }
}
