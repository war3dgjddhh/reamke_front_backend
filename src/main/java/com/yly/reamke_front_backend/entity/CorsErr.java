package com.yly.reamke_front_backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName cors_err
 */
@TableName(value ="cors_err")
@Data
public class CorsErr implements Serializable {
    /**
     * 
     */
    private String userId;

    /**
     * 
     */
    private String errMsg;

    /**
     * 
     */
    private LocalDateTime errTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}