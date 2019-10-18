package net.cnway.mybatis.controller;

import net.cnway.mybatis.domian.User;
import net.cnway.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author john.wang
 * @create 2019-10-16
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/{id}")
    public User getUserById(@PathVariable int id){

       return userService.getUserById(id);
    }

    @RequestMapping("/users")
    public List<User>getUsers(){

        return userService.getUsers();
    }
}
