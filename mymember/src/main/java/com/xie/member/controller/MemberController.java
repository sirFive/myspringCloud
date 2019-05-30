package com.xie.member.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/6/30.
 */
@RestController
public class MemberController {

    @Value("${server.port}")
    private String memberPort;

    @GetMapping(value = "getMember/{id}")
    //@PathVariable 路径参数
    public List<String> getMember(@PathVariable Integer id){
        List<String> memberList=new ArrayList<>();
        memberList.add("com/xie/member");
        memberList.add("wu");
        memberList.add("cheng");
        memberList.add("port:"+memberPort);
        memberList.add("id:"+id);
        return memberList;
    }

    @GetMapping(value = "getMember")
    public List<String> getMember2(){
        List<String> memberList=new ArrayList<>();
        memberList.add("com/xie/member");
        memberList.add("wu");
        memberList.add("cheng");
        memberList.add("port:"+memberPort);
        return memberList;
    }
}
