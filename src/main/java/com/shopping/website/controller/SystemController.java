package com.shopping.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.website.comonPojo.Result;
import com.shopping.website.pojo.System;
import com.shopping.website.service.SystemService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/system")
@CrossOrigin
@Api(value="/system", tags="反馈信息")
public class SystemController {

	@Autowired
	private SystemService service;
	
	@ApiOperation("反馈信息")
	@PostMapping("/getMessage")
	public Result getMessage(@RequestBody System system) {
		try {
			service.addMessage(system);
			return new Result(true, "提交成功", system);
		} catch (Exception e) {
			return new Result(false, "提交失败", e.getMessage());
		}
	}
	
}
