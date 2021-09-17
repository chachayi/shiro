package com.example.shiroredis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ShiroRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiroRedisApplication.class, args);
    }

}
