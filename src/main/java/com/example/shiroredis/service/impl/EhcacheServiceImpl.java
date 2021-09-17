package com.example.shiroredis.service.impl;

import com.example.shiroredis.entity.Article;
import com.example.shiroredis.service.EhcacheService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Describe：
 * @Date 2021/9/17
 * @Author xxy
 */
@Service
@CacheConfig(cacheNames = "emp")
public class EhcacheServiceImpl implements EhcacheService {
    @Override
    @Cacheable
    public Article getArticle(int id) {
        System.out.println("select * from --------------------");
        Article article = new Article();
        article.setContent("ehcache");
        return article;
    }
}
