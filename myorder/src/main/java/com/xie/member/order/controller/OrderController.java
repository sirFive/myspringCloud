package com.xie.member.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Administrator on 2018/6/30.
 * 使用restTemplate调用
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "getMember")
    public List<String> getMember(){
        return restTemplate.getForObject("http://service-member/getMember",List.class);
    }

    private  String name;

    @GetMapping(value = "getConfig")
    public String getFooInfo() {
        return name;
    }
}
