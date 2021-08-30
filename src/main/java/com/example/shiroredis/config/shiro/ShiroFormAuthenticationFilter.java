package com.example.shiroredis.config.shiro;

import com.alibaba.fastjson.JSON;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ShiroFormAuthenticationFilter extends FormAuthenticationFilter {

	@Override
	protected void redirectToLogin(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
		// 返回json
		servletResponse.setContentType("application/json; charset=utf-8");

		Map<String, Object> response = new HashMap<String, Object>(2);
		response.put("code", 401);
		response.put("msg", "未登录或者登录已失效");

		String json = JSON.toJSONString(response);

		servletResponse.getWriter().write(json);
	}

}
