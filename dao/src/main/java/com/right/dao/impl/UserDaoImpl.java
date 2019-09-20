package com.right.dao.impl;

import com.right.dao.UserDao;
import com.right.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class UserDaoImpl implements UserDao {
    @Override
    public User findUserByid(String id) {
        return new User("william");
    }
}
