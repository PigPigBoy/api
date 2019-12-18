package cn.edu.hqu.cst.api.service.impl;

import cn.edu.hqu.cst.api.dao.UserDao;
import cn.edu.hqu.cst.api.entity.User;
import cn.edu.hqu.cst.api.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return userDao.queryAll();
    }

    @Override
    public User getOneUser(int id) {
        return userDao.queryUserById(id);
    }
}
