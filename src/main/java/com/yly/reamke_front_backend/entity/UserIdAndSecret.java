package com.yly.reamke_front_backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName user_id_and_secret
 */
@TableName(value ="user_id_and_secret")
@Data
public class UserIdAndSecret implements Serializable {
    /**
     * 
     */
    @TableId
    private String userId;

    /**
     * 一个用户一个秘钥,一个秘钥对应多个appId
     */
    private String deviceId;

    /**
     * 
     */
    private String username;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}