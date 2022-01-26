package com.lxp.mapper;

import com.lxp.model.User;
import com.lxp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlseesion();
        UserMapper    userMapper  = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
        for(User user : userList){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
