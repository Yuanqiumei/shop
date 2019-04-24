package com.shopping.website.service;
import java.util.List;

import com.shopping.website.comonPojo.PageResult;
import com.shopping.website.pojo.Car;


public interface CarService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Car> findAll() throws Exception;
	
	/**
	 * 增加
	*/
	public void add(Car car) throws Exception;
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer [] ids) throws Exception;
}
