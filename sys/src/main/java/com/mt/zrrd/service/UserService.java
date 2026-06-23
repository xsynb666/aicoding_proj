package com.mt.zrrd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mt.zrrd.entity.User;

/**
 * 用户 Service 接口
 */
public interface UserService extends IService<User> {

    /**
     * 根据用户名查询用户
     */
    User getByUsername(String username);
}

