package cn.edu.hqu.cst.api.service;

import cn.edu.hqu.cst.api.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getOneUser(int id);
}
