package com.yly.reamke_front_backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yly.reamke_front_backend.entity.UserIdAndSecret;
import com.yly.reamke_front_backend.service.UserIdAndSecretService;
import com.yly.reamke_front_backend.mapper.UserIdAndSecretMapper;
import org.springframework.stereotype.Service;

/**
* @author hello
* @description 针对表【user_id_and_secret】的数据库操作Service实现
* @createDate 2022-08-20 21:57:56
*/
@Service
public class UserIdAndSecretServiceImpl extends ServiceImpl<UserIdAndSecretMapper, UserIdAndSecret>
    implements UserIdAndSecretService{

}




