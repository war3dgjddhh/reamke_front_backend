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
 * @TableName http_err
 */
@TableName(value ="http_err")
@Data
public class HttpErr implements Serializable {
    /**
     * 
     */
    private String userId;

    /**
     * 
     */
    private String errUrl;

    /**
     * 
     */
    private String errBody;

    /**
     * 
     */
    private Integer errStatus;

    /**
     * 
     */
    private LocalDateTime errTime;

    /**
     * 
     */
    private String errResponse;

    /**
     * 
     */
    private String errMethod;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}