package com.xie.member.order.MemberFeignInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2018/7/1.
 */
@FeignClient(value = "service-member")
public interface MemberFeignInterface {

    @RequestMapping(value = "getMember")
    List<String> getMemberByFeign();
}
