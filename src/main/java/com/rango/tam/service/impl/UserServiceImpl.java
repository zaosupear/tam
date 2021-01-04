package com.rango.tam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rango.tam.entity.User;
import com.rango.tam.mapper.UserMapper;
import com.rango.tam.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author rango
 * @description
 * @date 2020-12-27 23:19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
