package com.ideal.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ideal.mdb.bean.User;
import com.ideal.mdb.serviceI.IUser;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(tags="用户模块",value="UserController")
@RequestMapping(value="user")
public class UserController {
	@Autowired
	private IUser iUser;
	@ApiOperation(response=String.class,value="登录方法")
	@RequestMapping(value = "login", method = RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String login(@RequestBody User user) {
		System.out.println("kkk");
		return null;
	}
}
