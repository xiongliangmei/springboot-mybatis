package com;

import com.entity.User;
import com.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestUserMapper extends SupportTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void test1(){
        List<User> list = userMapper.getUserInfo();
        System.out.println(list.size());
    }
    @Test
    public void testList(){
        User user = new User();
        List<User> list = userMapper.getUserList(user);
        System.out.println(list.size());
    }
    @Test
    public void  insert(){
      userMapper.insert(new User(5,"xiongliang","123"));
      userMapper.insert(new User(6,"xiongliang2","123"));
      userMapper.insert(new User(7,"xl","123"));
    }
    @Test
    public void delete(){
      userMapper.delete(1);
    }
}
