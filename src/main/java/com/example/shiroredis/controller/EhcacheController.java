package com.example.shiroredis.controller;

import com.example.shiroredis.entity.Article;
import com.example.shiroredis.service.EhcacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Describe：
 * @Date 2021/9/17
 * @Author xxy
 */
@RestController
@RequestMapping("/ehcache")
public class EhcacheController {
    @Autowired
    EhcacheService ehcacheService;

    @RequestMapping(value = "test1",method = RequestMethod.GET)
    public Article test1(@RequestParam(value = "id") Integer id){
        return ehcacheService.getArticle(id);
    }
}
