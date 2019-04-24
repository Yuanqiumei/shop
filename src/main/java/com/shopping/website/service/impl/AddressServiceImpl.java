package com.shopping.website.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.website.dao.AddressDao;
import com.shopping.website.pojo.Address;
import com.shopping.website.service.AddressService;


@Service
public  class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressDao dao;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Address> findAll()  throws Exception{
		return dao.selectByExample(null);
	}

	/**
	 * 增加
	 */
	@Transactional
	@Override
	public void add(Address address)  throws Exception{
		dao.insert(address);		
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
