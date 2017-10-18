package com.syf.web.service;

import com.syf.web.mapper.UserMapper;
import com.syf.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(long id){
        User user=userMapper.findUserInfo(id);
        //User user=null;
        return user;
    }
}
