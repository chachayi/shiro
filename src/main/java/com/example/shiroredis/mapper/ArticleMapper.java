package com.example.shiroredis.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.shiroredis.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Describe：mp的mapper写法
 * @Date 2021/8/24
 * @Author xxy
 */
@Mapper
public interface ArticleMapper  extends BaseMapper<Article> {
    List<Article> selectArticle(Page page);
}
