package com.mt.zrrd.common.enums;

import lombok.Getter;

/**
 * 统一错误码枚举
 */
@Getter
public enum ResultCode {

    // 成功
    SUCCESS(200, "操作成功"),

    // 通用错误
    FAILED(500, "操作失败"),
    PARAM_ERROR(400, "参数错误"),
    UNAUTHORIZED(401, "未登录或Token已过期"),
    FORBIDDEN(403, "无权限访问"),
    NOT_FOUND(404, "资源不存在"),

    // 业务错误 1000+
    USER_NOT_FOUND(1001, "用户不存在"),
    USER_ALREADY_EXIST(1002, "用户已存在"),
    PASSWORD_ERROR(1003, "密码错误");

    private final Integer code;
    private final String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

