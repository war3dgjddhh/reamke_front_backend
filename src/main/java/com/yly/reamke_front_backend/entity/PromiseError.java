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
 * @TableName promise_error
 */
@TableName(value ="promise_error")
@Data
public class PromiseError implements Serializable {
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
    private String errType;

    /**
     * 
     */
    private LocalDateTime errTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}