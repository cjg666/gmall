package com.mytest.gmall.user.controller;

import com.mytest.gmall.user.bean.UmsMember;
import com.mytest.gmall.user.bean.UmsMemberReceiveAddress;
import com.mytest.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<UmsMember> findAll(){
        List<UmsMember> list=userService.findAll();
        return list;
    }

    @RequestMapping("getAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getAddress(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses=userService.getAddress(memberId);
        return umsMemberReceiveAddresses;
    }
}
