package cn.edu.hqu.cst.api.controller;

import cn.edu.hqu.cst.api.entity.User;
import cn.edu.hqu.cst.api.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/api/list")
    public List<User> getAllUsers(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin","*");
        return userService.getAllUsers();
    }

    @GetMapping("/api/user/{id}")
    public User getOneUser(@PathVariable("id") int id,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin","*");
        return userService.getOneUser(id);
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello!";
    }
}
