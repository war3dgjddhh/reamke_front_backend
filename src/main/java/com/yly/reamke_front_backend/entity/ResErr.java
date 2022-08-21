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
 * @TableName res_err
 */
@TableName(value ="res_err")
@Data
public class ResErr implements Serializable {
    /**
     * 
     */
    private String userId;

    /**
     * 
     */
    private String errSrc;

    /**
     * 
     */
    private String errHtml;

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