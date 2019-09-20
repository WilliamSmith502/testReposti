package com.right.dao;

import com.right.entity.User;

public interface UserDao {
    User findUserByid(String id);
}
