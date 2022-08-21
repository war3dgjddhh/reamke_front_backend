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
 * @TableName page_view
 */
@TableName(value ="page_view")
@Data
public class PageView implements Serializable {
    /**
     * 
     */
    private String userId;

    /**
     * 
     */
    private String routePath;

    /**
     * 
     */
    private Double pageDuration;

    /**
     * 
     */
    private LocalDateTime pvTime;

    /**
     * 
     */
    private String userIp;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}