package com.mt.zrrd.controller;

import com.mt.zrrd.common.result.Result;
import com.mt.zrrd.entity.User;
import com.mt.zrrd.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户 Controller
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * 查询用户列表
     */
    @GetMapping("/list")
    public Result<List<User>> list() {
        return Result.success(userService.list());
    }

    /**
     * 根据 ID 查询用户
     */
    @GetMapping("/{id}")
    public Result<User> getById(@PathVariable Long id) {
        return Result.success(userService.getById(id));
    }

    /**
     * 新增用户
     */
    @PostMapping
    public Result<Void> save(@RequestBody User user) {
        userService.save(user);
        return Result.success();
    }

    /**
     * 更新用户
     */
    @PutMapping
    public Result<Void> update(@RequestBody User user) {
        userService.updateById(user);
        return Result.success();
    }

    /**
     * 删除用户
     */
    @DeleteMapping("/{id}")
    public Result<Void> delete(@PathVariable Long id) {
        userService.removeById(id);
        return Result.success();
    }
}

