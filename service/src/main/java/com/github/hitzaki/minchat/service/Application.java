package com.github.hitzaki.minchat.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.github.hitzaki.minchat.service",
        "com.github.hitzaki.minchat.common"})
@MapperScan("com.github.hitzaki.minchat.service.*.dao.mapper")
//导入用户资料，删除用户资料，修改用户资料，查询用户资料
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}




