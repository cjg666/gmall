package com.mytest.gmall.user.service.impl;

import com.mytest.gmall.user.bean.UmsMember;
import com.mytest.gmall.user.bean.UmsMemberReceiveAddress;
import com.mytest.gmall.user.mapper.UmsMemberMapper;
import com.mytest.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.mytest.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UmsMemberMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> findAll() {
        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getAddress(String memberId) {
        Example e = new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId",memberId);
        return umsMemberReceiveAddressMapper.selectByExample(e);
    }
}
