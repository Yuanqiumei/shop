package com.shopping.website.controller;
import java.util.List;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.website.comonPojo.PageResult;
import com.shopping.website.comonPojo.Result;
import com.shopping.website.pojo.TbGoods;
import com.shopping.website.service.TbgoodsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;


@Api(value="/tbgoods", tags="商品相关")
@CrossOrigin
@RestController
@RequestMapping("/tbgoods")
public class TbgoodsController {

	@Autowired
	private TbgoodsService tbgoodsService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@ApiOperation("查询所有")
	@GetMapping("/find/all.do")
	public Result findAll(){	
		try{
			List<TbGoods> list = tbgoodsService.findAll();
			return new Result(true,"查询成功", list);			
		}catch(Exception e){
			return new Result(false,"查询失败", e.getMessage());
		}		
	}
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	@ApiOperation("分页查询所有")
	@GetMapping("/find/page.do")
	public Result  findPage(Integer page,Integer rows){	
		try{
			PageResult  pr = tbgoodsService.findPage(page, rows);
			return new Result(true,"查询成功", pr);			
		}catch(Exception e){
			return new Result(false,"查询失败", e.getMessage());
		}		
	}
	
	/**
	 * 增加
	 * @param tbgoods
	 * @return
	 */
	@ApiOperation("新增商品")
	@PostMapping("/add/tbgoods.do")
	public Result add(@RequestBody TbGoods tbgoods){
		try {
			tbgoodsService.add(tbgoods);
			return new Result(true, "添加成功", tbgoods);
		} catch (Exception e) {
			return new Result(false, "添加失败", e.getMessage());
		}
	}
	
	/**
	 * 修改
	 * @param tbgoods
	 * @return
	 */
	@ApiOperation("修改商品")
	@PostMapping("/update/tbgoods.do")
	public Result update(@RequestBody TbGoods tbgoods){
		try {
			tbgoodsService.update(tbgoods);
			return new Result(true, "修改成功", tbgoods);
		} catch (Exception e) {
			return new Result(false, "修改失败", e.getMessage());
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@ApiOperation("查询单个")
	@GetMapping("/find/one.do")
	public Result findOne(Integer id){
		try{
			TbGoods tbgoods = tbgoodsService.findOne(id);
			return new Result(true,"查询成功", tbgoods);			
		}catch(Exception e){
			return new Result(false,"查询失败", e.getMessage());
		}	
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@ApiOperation("批量删除")
	@PostMapping("/delete/tbgoods.do")
	public Result delete(Integer [] ids){
		try {
			tbgoodsService.delete(ids);
			return new Result(true, "删除成功", null); 
		} catch (Exception e) {
			return new Result(false, "删除失败", e.getMessage());
		}
	}
	
		/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	@ApiOperation("分页条件查询")
	@PostMapping("/find/search.do")
	public Result search(@RequestBody TbGoods tbgoods, Integer page, Integer rows  ){
		try {
			PageResult pr = tbgoodsService.findPage(tbgoods, page, rows);
			return new Result(true, "查询成功", pr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Result(true, "查询失败", e.getMessage());
		}			
	}
	
}
