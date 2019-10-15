package com.mytest.gmall.user.service;

import com.mytest.gmall.user.bean.UmsMember;
import com.mytest.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

   List<UmsMember> findAll();

   List<UmsMemberReceiveAddress> getAddress(String memberId);
}
