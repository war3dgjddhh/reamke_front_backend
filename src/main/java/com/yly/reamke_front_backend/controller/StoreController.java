package com.yly.reamke_front_backend.controller;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yly.reamke_front_backend.entity.*;
import com.yly.reamke_front_backend.service.*;
import com.yly.reamke_front_backend.service.impl.*;
import com.yly.reamke_front_backend.utils.IpHelper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @auther Gpu is all you need
 * @date 2022/8/20
 */
@CrossOrigin
@RestController
@RequestMapping("api/store")
public class StoreController {
    @Resource
    ObjectMapper objectMapper;
    @Resource
    ApiRecordServiceImpl apiRecordService;
    @Resource
    WebPrefServiceImpl webPrefService;
    @Resource
    WebResourceServiceImpl webResourceService;
    @Resource
    PageViewServiceImpl pageViewService;
    @Resource
    JsErrServiceImpl jsErrService;
    @Resource
    ResErrServiceImpl resErrService;
    @Resource
    CorsErrServiceImpl corsErrService;
    @Resource
    HttpErrServiceImpl httpErrService;
    @Resource
    PromiseErrorServiceImpl promiseErrorService;

    // 接口
    @RequestMapping("api")
    boolean api(@RequestBody String param) throws JsonProcessingException {
        ApiRecord apiRecord = objectMapper.readValue(param, ApiRecord.class);
        apiRecordService.save(apiRecord); // 插入失败会报错
        return true;
    }

    // pref
    @RequestMapping("pref")
    boolean pref(@RequestBody String param) throws JsonProcessingException {
        WebPref webPref = objectMapper.readValue(param, WebPref.class);
        webPrefService.save(webPref); // 插入失败会报错
        return true;
    }

    // pref res
    @RequestMapping("res")
    boolean res(@RequestBody String param) throws JsonProcessingException {
        Map<String, Object> map = objectMapper.readValue(param, new TypeReference<Map<String, Object>>() {
        });
        ArrayList<WebResource> webResources = objectMapper.convertValue(map.get("data"), new TypeReference<ArrayList<WebResource>>() {
        });
        String userId = (String) map.get("userId");
        webResourceService.saveBatch(webResources.stream().peek((el) -> el.setUserId(userId)).collect(Collectors.toList()));
        return true;
    }

    // pv
    @RequestMapping("pv")
    boolean pv(HttpServletRequest request, @RequestBody String param) throws JsonProcessingException {
        String userIp = IpHelper.getRealIp(request);
        PageView pageView = objectMapper.readValue(param, PageView.class);
        pageView.setUserIp(userIp);
        pageViewService.save(pageView);
        return true;
    }

    // exception jsErr
    @RequestMapping("jsErr")
    boolean jsErr(@RequestBody String param) throws JsonProcessingException {
        JsErr jsErr = objectMapper.readValue(param, JsErr.class);
        jsErrService.save(jsErr);
        return true;
    }

    // exception httpErr 感觉apiErr更好一点
    @RequestMapping("httpErr")
    boolean httpErr(@RequestBody String param) throws JsonProcessingException {
        HttpErr httpErr = objectMapper.readValue(param, HttpErr.class);
        httpErrService.save(httpErr);
        return true;
    }

    @RequestMapping("corsErr")
    boolean corsErr(@RequestBody String param) throws JsonProcessingException {
        CorsErr corsErr = objectMapper.readValue(param, CorsErr.class);
        corsErrService.save(corsErr);
        return true;
    }

    @RequestMapping("resErr")
    boolean resErr(@RequestBody String param) throws JsonProcessingException {
        ResErr resErr = objectMapper.readValue(param, ResErr.class);
        resErrService.save(resErr);
        return true;
    }

    @RequestMapping("promiseErr")
    boolean promiseErr(@RequestBody String param) throws JsonProcessingException {
        PromiseError promiseError = objectMapper.readValue(param, PromiseError.class);
        promiseErrorService.save(promiseError);
        return true;
    }
}
