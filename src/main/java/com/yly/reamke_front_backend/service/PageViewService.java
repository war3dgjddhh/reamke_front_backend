package com.yly.reamke_front_backend.service;

import com.yly.reamke_front_backend.entity.PageView;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author hello
* @description 针对表【page_view】的数据库操作Service
* @createDate 2022-08-20 18:21:46
*/
public interface PageViewService extends IService<PageView> {
    // list pv
    List<PageView> listPV(@Param("pv")PageView pv, @Param("userId")String userId);
    List<PageView> listUV(@Param("pv")PageView pv, @Param("userId")String userId);
}
