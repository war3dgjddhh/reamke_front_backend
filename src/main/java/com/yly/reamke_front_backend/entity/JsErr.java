package com.yly.reamke_front_backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName js_err
 */
@TableName(value ="js_err")
@Data
public class JsErr implements Serializable {
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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}