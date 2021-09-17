package com.example.shiroredis.service;

import com.example.shiroredis.entity.Article;

/**
 * @Describe：
 * @Date 2021/9/17
 * @Author xxy
 */
public interface EhcacheService {
    Article getArticle(int id);
}
