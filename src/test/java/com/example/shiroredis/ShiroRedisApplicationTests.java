package com.example.shiroredis;

import com.baomidou.mybatisplus.plugins.Page;
import com.example.shiroredis.entity.Article;
import com.example.shiroredis.service.ArticleService;
import com.example.shiroredis.service.impl.ArticleMPService;
import com.example.shiroredis.service.rabbitmq.MsgProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ShiroRedisApplicationTests {

    @Resource
    ArticleMPService articleMPService;

    @Autowired
    MsgProducer msgProducer;

    @Test
    void contextLoads() {
    }

    @Test
    void test(){
//        Page<Article> page=new Page(2,5);
//        page = articleMPService.selectArticlePage(page);
//        page = articleMPService.selectById(page);
//        System.out.println("aa");
    }

    @Test
    void test2(){
        for(int i=0;i<10;i++){
            msgProducer.sendMsg("bb");
        }

    }

}
