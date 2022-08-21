package com.yly.reamke_front_backend;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yly.reamke_front_backend.mapper")
public class RemakeFrontBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(RemakeFrontBackendApplication.class, args);
    }

}
