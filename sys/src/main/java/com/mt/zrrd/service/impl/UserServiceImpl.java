package com.mt.zrrd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mt.zrrd.entity.User;
import com.mt.zrrd.mapper.UserMapper;
import com.mt.zrrd.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 用户 Service 实现
 */
@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public User getByUsername(String username) {
        return lambdaQuery()
                .eq(User::getUsername, username)
                .one();
    }
}

