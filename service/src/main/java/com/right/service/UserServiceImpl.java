package com.right.service;

import com.right.dao.UserDao;
import com.right.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public User findUserById(String id) {
        return userDao.findUserByid(id);
    }
}
