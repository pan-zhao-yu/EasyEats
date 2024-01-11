package com.zhaoyu.easyeats.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhaoyu.easyeats.entity.User;
import com.zhaoyu.easyeats.mapper.UserMapper;
import com.zhaoyu.easyeats.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
}
