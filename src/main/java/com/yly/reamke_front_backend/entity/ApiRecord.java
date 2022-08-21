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
 * @TableName api_record
 */
@TableName(value ="api_record")
@Data
public class ApiRecord implements Serializable {
    /**
     * 
     */
    private String userId;

    /**
     * 
     */
    private String apiMethod;

    /**
     * 
     */
    private String apiUrl;

    /**
     * 
     */
    private Integer apiStatus;

    /**
     * 
     */
    private LocalDateTime apiTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}