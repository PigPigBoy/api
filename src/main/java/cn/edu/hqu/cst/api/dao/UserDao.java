package cn.edu.hqu.cst.api.dao;

import cn.edu.hqu.cst.api.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    List<User> queryAll();

    User queryUserById(int id);
}
