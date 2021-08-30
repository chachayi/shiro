package com.example.shiroredis.config.shiro;

import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

/**
 * @author:
 * @description: 自定义Realm
 * @date:
 */
public class UserRealm extends AuthorizingRealm {
	private Logger logger = LoggerFactory.getLogger(UserRealm.class);

	/**
	 * 验证当前Subject的角色-权限信息
	 * 登录成功后，执行（checkRole，checkPermission）时 执行此方法
	 */
	@Override
	@SuppressWarnings("unchecked")
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//		Session session = SecurityUtils.getSubject().getSession();
//		//查询用户的权限
//		JSONObject permission = (JSONObject) session.getAttribute(Constants.SESSION_USER_PERMISSION);
//		logger.info("permission的值为:" + permission);
//		logger.info("本用户权限为:" + permission.get("permissionList"));
//		//为当前用户设置角色和权限
//		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
//		authorizationInfo.addStringPermissions((Collection<String>) permission.get("permissionList"));
//		return authorizationInfo;
		return null;
	}

	/**
	 * 验证当前登录的Subject
	 * 执行Subject.login()时 执行此方法
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		String loginName = (String) authcToken.getPrincipal();
		// 获取用户密码
		String password = new String((char[]) authcToken.getCredentials());
		JSONObject user = new JSONObject();
		user.put("username","aa");
		user.put("password","bb");
		if (user == null) {
			//没找到帐号
			throw new UnknownAccountException();
		}
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
				//SecurityUtils.getSubject().getPrincipal 数据就是这里传入的
				user.getString("username"),
				user.getString("password"),
				getName()
		);
		return authenticationInfo;
	}
}
