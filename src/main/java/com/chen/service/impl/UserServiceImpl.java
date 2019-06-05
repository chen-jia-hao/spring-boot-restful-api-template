package com.chen.service.impl;

import com.chen.dao.UserMapper;
import com.chen.model.User;
import com.chen.service.UserService;
import com.chen.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by chenJiaHao on 2019-06-05.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
