package com.dsf.spring_boot_learn.service.impl;

import com.dsf.spring_boot_learn.mapper.UserMapper;
import com.dsf.spring_boot_learn.pojo.User;
import com.dsf.spring_boot_learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
