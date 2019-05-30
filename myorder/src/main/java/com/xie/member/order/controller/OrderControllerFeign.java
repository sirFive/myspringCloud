package com.xie.member.order.controller;

import com.xie.member.order.MemberFeignInterface.MemberFeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/7/1.
 * 使用feeign调用
 */
@RestController
public class OrderControllerFeign {

    @Autowired
    MemberFeignInterface memberFeignInterface;

    @RequestMapping(value = "getMemberByFeign")
    public List<String> getMemberByFeign(){
        return memberFeignInterface.getMemberByFeign();
    }

}
