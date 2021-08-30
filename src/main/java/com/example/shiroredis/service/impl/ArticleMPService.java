package com.example.shiroredis.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.example.shiroredis.entity.Article;
import com.example.shiroredis.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Describe：
 * @Date 2021/8/24
 * @Author xxy
 */
@Service
public class ArticleMPService {
    @Autowired
    ArticleMapper articleMapper;

    public Page<Article> selectArticlePage(Page<Article> page) {
        page.setRecords(articleMapper.selectPage(page, null));
        return page;
    }

    public Page<Article> selectById(Page<Article> page) {
        page.setRecords(articleMapper.selectArticle(page));
        return page;
    }
}
