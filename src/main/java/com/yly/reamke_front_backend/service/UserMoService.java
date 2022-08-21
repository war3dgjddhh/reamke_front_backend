package com.yly.reamke_front_backend.service;

import com.yly.reamke_front_backend.entity.UserMo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yly.reamke_front_backend.vo.query.UserQuery;

import java.util.Map;

/**
* @author hello
* @description 针对表【user_mo】的数据库操作Service
* @createDate 2022-08-20 21:57:56
*/
public interface UserMoService extends IService<UserMo> {
    // is legitimate user  是否合法用户
    boolean isLegitimateUser(UserQuery userQuery);
}
