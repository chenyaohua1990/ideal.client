package com.ideal.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.ideal.mdb.bean.User;
import com.ideal.mdb.serviceI.IUser;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(tags="用户模块",value="UserController")
@RequestMapping(value="user")
public class UserController {
	/**
	 * 日志
	 */
	Logger logger =LoggerFactory.getLogger(UserController.class);
	@Autowired
	private IUser iUser;
	
	@ApiOperation(response=String.class,value="登录方法")
	@RequestMapping(value = "login", method = RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String login(@RequestBody User user) {
		
		User login = iUser.login(user);
		String userStr = JSON.toJSONString(login);
		logger.debug(userStr);
		return userStr;
	}
}
