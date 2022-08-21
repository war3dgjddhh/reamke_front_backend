package com.yly.reamke_front_backend.vo.query;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @auther Gpu is all you need
 * @date 2022/8/20
 */
@Data
public class UserQuery <T> {
    @NotNull
    private String userId;
    @NotNull
    private String deviceId;
    private T param;
}
