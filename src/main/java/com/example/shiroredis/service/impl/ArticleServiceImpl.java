package com.example.shiroredis.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.shiroredis.dao.ArticleDao;
import com.example.shiroredis.service.ArticleService;
import com.example.shiroredis.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;

	/**
	 * 新增文章
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject addArticle(JSONObject jsonObject) {
		articleDao.addArticle(jsonObject);
		return CommonUtil.successJson();
	}

	/**
	 * 文章列表
	 */
	@Override
	public JSONObject listArticle(JSONObject jsonObject) {
		CommonUtil.fillPageParam(jsonObject);
		int count = articleDao.countArticle(jsonObject);
		List<JSONObject> list = articleDao.listArticle(jsonObject);
		return CommonUtil.successPage(jsonObject, list, count);
	}

	/**
	 * 更新文章
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject updateArticle(JSONObject jsonObject) {
		articleDao.updateArticle(jsonObject);
		return CommonUtil.successJson();
	}
}
