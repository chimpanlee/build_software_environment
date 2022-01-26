package com.lxp.mapper;

import com.lxp.model.User;

import java.util.List;
public interface UserMapper {
   //查询全部用户
   List<User> getUserList();
}