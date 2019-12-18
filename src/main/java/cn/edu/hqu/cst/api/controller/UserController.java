package cn.edu.hqu.cst.api.controller;

import cn.edu.hqu.cst.api.entity.User;
import cn.edu.hqu.cst.api.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/api/list")
    public List<User> getAllUsers() {
        System.out.println("1");
        return userService.getAllUsers();
    }

    @GetMapping("/api/user/{id}")
    public User getOneUser(@PathVariable("id") int id){
        System.out.println("2");
        return userService.getOneUser(id);
    }
}
