package com.dsf.spring_boot_learn.service;

import com.dsf.spring_boot_learn.pojo.User;

public interface UserService {
    public User findById(Integer id);
}
