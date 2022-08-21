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
 * @TableName web_pref
 */
@TableName(value ="web_pref")
@Data
public class WebPref implements Serializable {
    /**
     * 
     */
    private String userId;

    /**
     * 
     */
    private Double prefFp;

    /**
     * 
     */
    private Double prefTti;

    /**
     * 
     */
    private Double prefDomReady;

    /**
     * 
     */
    private Double prefLoad;

    /**
     * 
     */
    private Double prefFirstByte;

    /**
     * 
     */
    private Double prefDns;

    /**
     * 
     */
    private Double prefTcp;

    /**
     * 
     */
    private Double prefSsl;

    /**
     * 
     */
    private Double prefTtfb;

    /**
     * 
     */
    private Double prefTrans;

    /**
     * 
     */
    private Double prefDomParse;

    /**
     * 
     */
    private Double prefRes;

    /**
     * 
     */
    private Double prefCls;

    /**
     * 
     */
    private Double prefFcp;

    /**
     * 
     */
    private Double prefFid;

    /**
     * 
     */
    private Double prefLcp;

    /**
     * 
     */
    private LocalDateTime reportTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}