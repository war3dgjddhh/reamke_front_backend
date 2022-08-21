package com.yly.reamke_front_backend.mapper;

import com.yly.reamke_front_backend.entity.PageView;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author hello
* @description 针对表【page_view】的数据库操作Mapper
* @createDate 2022-08-21 11:16:32
* @Entity com.yly.reamke_front_backend.entity.PageView
*/
public interface PageViewMapper extends BaseMapper<PageView> {

    List<PageView> listPV(PageView pv, String userId);
    List<PageView> listUV(PageView pv, String userId);
}




