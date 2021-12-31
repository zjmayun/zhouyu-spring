package com.jackey.service;

import com.spring.*;

@Component("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userService;

    public void test() {
        System.out.println("test");
    }
}
