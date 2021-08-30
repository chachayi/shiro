package com.example.shiroredis.dao;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description: mybatis的mapper写法
 */
@Mapper
public interface ArticleDao {
	/**
	 * 新增文章
	 */
	int addArticle(JSONObject jsonObject);

	/**
	 * 统计文章总数
	 */
	int countArticle(JSONObject jsonObject);

	/**
	 * 文章列表
	 */
	List<JSONObject> listArticle(JSONObject jsonObject);

	/**
	 * 更新文章
	 */
	int updateArticle(JSONObject jsonObject);
}
