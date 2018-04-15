package com.ideal.us.ws.serviceImp;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.ideal.mdb.bean.User;
import com.ideal.mdb.serviceI.IUser;
import com.ideal.us.ws.serviceI.IUserService;
@WebService
public class UserServiceImp implements IUserService{
	
	@Autowired
	private IUser iUser;
	@Override
	@WebMethod
	public List<User> userList(@WebParam(name="user")User user,@WebParam(name="startPage") int startPage,@WebParam(name="pageSize") int pageSize) {
		
		return iUser.queryUserList(user, startPage, pageSize);
	}

}
