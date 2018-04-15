package com.ideal.us.ws.serviceI;

import java.util.List;

import com.ideal.mdb.bean.User;

public interface IUserService {
	
	List<User> userList(User user,int startPage,int pageSize);
}
