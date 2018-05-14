package com.keven.interview.controller;

import com.keven.interview.annotation.Logined;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author keven
 * @date 2018-05-14 下午10:51
 * @Description 测试下自定义 注解 及 aop 实现
 */
@RestController
public class TestAnnotion {


    @GetMapping("/login-test")
    @Logined(others = "user, password")
    public void loginTest() {
        System.out.println("login test ...");
    }
}
