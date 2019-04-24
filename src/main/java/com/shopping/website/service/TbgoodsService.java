package com.shopping.website.service;
import java.util.List;

import com.shopping.website.comonPojo.PageResult;
import com.shopping.website.pojo.TbGoods;


public interface TbgoodsService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbGoods> findAll() throws Exception;
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(Integer pageNum,Integer pageSize) throws Exception;
	
	
	/**
	 * 增加
	*/
	public void add(TbGoods tbgoods) throws Exception;
	
	
	/**
	 * 修改
	 */
	public void update(TbGoods tbgoods) throws Exception;
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbGoods findOne(Integer id) throws Exception;
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer [] ids) throws Exception;

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbGoods tbgoods, Integer pageNum,Integer pageSize) throws Exception;
	
}
