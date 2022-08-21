package com.yly.reamke_front_backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yly.reamke_front_backend.entity.UserIdAndSecret;
import com.yly.reamke_front_backend.entity.UserMo;
import com.yly.reamke_front_backend.mapper.UserIdAndSecretMapper;
import com.yly.reamke_front_backend.service.UserMoService;
import com.yly.reamke_front_backend.mapper.UserMoMapper;
import com.yly.reamke_front_backend.vo.query.UserQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hello
 * @description 针对表【user_mo】的数据库操作Service实现
 * @createDate 2022-08-20 21:57:56
 */
@Service
public class UserMoServiceImpl extends ServiceImpl<UserMoMapper, UserMo>
        implements UserMoService {
    @Resource
    UserIdAndSecretMapper userIdAndSecretMapper;

    public boolean isLegitimateUser(UserQuery userQuery) {
        LambdaQueryWrapper<UserIdAndSecret> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(UserIdAndSecret::getUserId, userQuery.getUserId())
                .eq(UserIdAndSecret::getDeviceId, userQuery.getDeviceId());
        return userIdAndSecretMapper.exists(queryWrapper);
    }
}




