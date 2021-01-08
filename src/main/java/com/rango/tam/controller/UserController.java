package com.rango.tam.controller;

import com.rango.tam.annotation.ResponseResult;
import com.rango.tam.entity.User;
import com.rango.tam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rango
 * @description
 * @date 2020-12-27 23:12
 */
@RestController
@ResponseResult
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user = userService.getById(id);
        return user;
    }



}
