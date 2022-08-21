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
 * @TableName web_resource
 */
@TableName(value ="web_resource")
@Data
public class WebResource implements Serializable {
    /**
     * 
     */
    private String userId;

    /**
     * 
     */
    private String resSrc;

    /**
     * 
     */
    private Integer resTransSize;

    /**
     * 
     */
    private String resType;

    /**
     * 
     */
    private Integer resDuration;

    /**
     * 
     */
    private LocalDateTime resTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}