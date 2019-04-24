package com.shopping.website.controller;
import java.util.List;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.website.comonPojo.PageResult;
import com.shopping.website.comonPojo.Result;
import com.shopping.website.pojo.Address;
import com.shopping.website.service.AddressService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;


@Api(value="/Address", tags="家庭住址")
@CrossOrigin
@RestController
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@ApiOperation("查询所有")
	@GetMapping("/find")
	public Result findAll(){	
		try{
			List<Address> list = addressService.findAll();
			return new Result(true,"查询成功", list);			
		}catch(Exception e){
			return new Result(false,"查询失败", e.getMessage());
		}		
	}
	
	
	/**
	 * 增加
	 * @param 
	 * @return
	 */
	@ApiOperation("新增商品")
	@PostMapping("/add/address.do")
	public Result add(@RequestBody Address address){
		try {
			addressService.add(address);
			return new Result(true, "添加成功", address);
		} catch (Exception e) {
			return new Result(false, "添加失败", e.getMessage());
		}
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@ApiOperation("批量删除")
	@PostMapping("/delete/address.do")
	public Result delete(Integer [] ids){
		try {
			addressService.delete(ids);
			return new Result(true, "删除成功", null); 
		} catch (Exception e) {
			return new Result(false, "删除失败", e.getMessage());
		}
	}
	
	
	
}
