package com.ylw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    @Value("${login.userName:default}")
    private String userName;

    @Value("${login.passWord:default}")
    private String passWord;

    @RequestMapping("/getLoginMsg")
    public String setString() {
        return userName + " ---- " + passWord;
    }


}
