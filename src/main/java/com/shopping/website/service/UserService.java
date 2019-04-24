
package com.shopping.website.service;

import com.shopping.website.pojo.User;



public interface UserService {

	User regist(User user) throws Exception;
	
	User Login(String username, String password) throws Exception;
	
	User Change(User user) throws Exception;
}
