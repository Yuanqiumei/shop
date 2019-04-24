package com.shopping.website.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.website.dao.CarDao;
import com.shopping.website.pojo.Car;
import com.shopping.website.service.CarService;


@Service
public  class CarServiceImpl implements CarService {

	@Autowired
	private CarDao dao;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Car> findAll()  throws Exception{
		return dao.selectByExample(null);
	}

	/**
	 * 增加
	 */
	@Transactional
	@Override
	public void add(Car car)  throws Exception{
		dao.insert(car);		
	}

	/**
	 * 批量删除
	 */
	@Transactional
	@Override
	public void delete(Integer[] ids)  throws Exception{
		for(Integer id:ids){
			dao.deleteByPrimaryKey(id);
		}		
	}
}
