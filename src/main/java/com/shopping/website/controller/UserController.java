package com.shopping.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.website.comonPojo.Result;
import com.shopping.website.pojo.User;
import com.shopping.website.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/user")
@CrossOrigin
@Api(value="/user", tags="用户相关")
public class UserController {

	@Autowired
	private UserService service;
	
	@ApiOperation("用户登陆")
	@PostMapping("/login")
	public Result login(String username, String password) {
		try {
			User user = service.Login(username, password);
			if(user == null) {
				return new Result(false, "此用户不存在", null);
			}else {
				return new Result(true, "登陆成功", user);
			}
			
		}catch(Exception e) {
			return new Result(false, "登陆失败", e.getMessage());
		}
	}
	
	@ApiOperation("用户注册")
	@PostMapping("/regist")
	public Result regist(User user) {
		try {
			User registUser = service.regist(user);
			return new Result(true, "注册成功", registUser);
			
		}catch(Exception e) {
			return new Result(false, "注册失败", e.getMessage());
		}
	}
	
	@ApiOperation("修改密码")
	@PostMapping("/change")
	public Result change(User user) {
		try {
			User user1 = service.Change(user);
			if(user1 == null) {
				return new Result(false, "此用户不存在", null);
			}else {
				return new Result(true, "修改成功", user1);
			}
			
		}catch(Exception e) {
			return new Result(false, "修改失败", e.getMessage());
		}
	}
}
