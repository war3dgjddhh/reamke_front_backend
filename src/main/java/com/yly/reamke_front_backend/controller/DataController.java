package com.yly.reamke_front_backend.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yly.reamke_front_backend.entity.PageView;
import com.yly.reamke_front_backend.entity.WebPref;
import com.yly.reamke_front_backend.entity.WebResource;
import com.yly.reamke_front_backend.service.impl.PageViewServiceImpl;
import com.yly.reamke_front_backend.service.impl.UserMoServiceImpl;
import com.yly.reamke_front_backend.service.impl.WebPrefServiceImpl;
import com.yly.reamke_front_backend.service.impl.WebResourceServiceImpl;
import com.yly.reamke_front_backend.utils.R;
import com.yly.reamke_front_backend.vo.query.UserQuery;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther Gpu is all you need
 * @date 2022/8/20
 */
@CrossOrigin
@RestController
@RequestMapping("api/data")
public class DataController {
    @Resource
    UserMoServiceImpl userMoService;
    @Resource
    WebPrefServiceImpl webPrefService;
    @Resource
    WebResourceServiceImpl webResourceService;
    @Resource
    PageViewServiceImpl pageViewService;


    @RequestMapping("webVital")
    R<List<WebPref>> getPref(@RequestBody UserQuery<Void> userQuery) {
        if (!userMoService.isLegitimateUser(userQuery)) return R.fail();
        LambdaQueryWrapper<WebPref> q = new LambdaQueryWrapper<>();
        q.eq(WebPref::getUserId, userQuery.getUserId());
        List<WebPref> res = webPrefService.list(q);
        return R.ok(res);
    }

    @RequestMapping("resource")
    R<List<WebResource>> getResourceInfo(@RequestBody UserQuery<Void> userQuery) {
        if (!userMoService.isLegitimateUser(userQuery)) return R.fail();
        LambdaQueryWrapper<WebResource> q = new LambdaQueryWrapper<>();
        q.eq(WebResource::getUserId, userQuery.getUserId());
        List<WebResource> res = webResourceService.list(q);
        return R.ok(res);
    }
    @RequestMapping("pv")
    R<List<PageView>> getPv(@RequestBody UserQuery<PageView> userQuery) {
        if (!userMoService.isLegitimateUser(userQuery)) return R.fail();
        List<PageView> res =  pageViewService.listPV(userQuery.getParam(),userQuery.getUserId());
        return R.ok(res);
    }

    @RequestMapping("uv")
    R<List<PageView>> getUv(@RequestBody UserQuery<PageView> userQuery) {
        if (!userMoService.isLegitimateUser(userQuery)) return R.fail();
        List<PageView> res =  pageViewService.listUV(userQuery.getParam(),userQuery.getUserId());
        return R.ok(res);
    }
}
