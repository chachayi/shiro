package com.example.shiroredis.dao;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author: hxy
 * @description: 登录相关dao
 * @date: 2017/10/24 11:02
 */
@Mapper
public interface LoginDao {
	/**
	 * 根据用户名和密码查询对应的用户
	 */
	Map getUser(@Param("username") String username, @Param("password") String password);
}
