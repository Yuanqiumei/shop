
package com.shopping.website.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.website.dao.UserDao;
import com.shopping.website.pojo.User;
import com.shopping.website.pojo.UserExample;
import com.shopping.website.pojo.UserExample.Criteria;
import com.shopping.website.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	
	@Override
	public User regist(User user) throws Exception {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(user.getUsername());
		List<User> userList = dao.selectByExample(example);
		if(userList != null && userList.size() > 0) {
			throw new Exception("用户" + user.getUsername() + "已注册");
		}
		dao.insert(user);
		return user;
		
	}

	
	@Override
	public User Login(String username, String password) throws Exception {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(password);
		List<User> list = dao.selectByExample(example);
		if(list != null && list.size() > 0) {
			return list.get(0);
		}else {
			return null;
		}
	}


	@Override
	public User Change(User user) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(user.getUsername());
		criteria.andPasswordNotEqualTo(user.getPassword());
		List<User> list = dao.selectByExample(example);
		dao.updateByPrimaryKey(user);
		return user;
	}
}
