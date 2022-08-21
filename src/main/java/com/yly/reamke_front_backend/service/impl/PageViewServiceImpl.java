package com.yly.reamke_front_backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yly.reamke_front_backend.entity.PageView;
import com.yly.reamke_front_backend.mapper.PageViewMapper;
import com.yly.reamke_front_backend.service.PageViewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hello
 * @description 针对表【page_view】的数据库操作Service实现
 * @createDate 2022-08-20 18:21:46
 */
@Service
public class PageViewServiceImpl extends ServiceImpl<PageViewMapper, PageView>
        implements PageViewService {

    @Resource
    PageViewMapper pageViewMapper;

    @Override
    public List<PageView> listPV(PageView pv, String userId) {
        return pageViewMapper.listPV(pv, userId);
    }

    /**
     * @return 这个返回的pageView的duration是平均时间,
     */
    @Override
    public List<PageView> listUV(PageView pv, String userId) {
        return pageViewMapper.listUV(pv, userId);
    }
}




