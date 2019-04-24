package com.shopping.website.service;
import java.util.List;

import com.shopping.website.comonPojo.PageResult;
import com.shopping.website.pojo.Address;

public interface AddressService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Address> findAll() throws Exception;
	
	/**
	 * 增加
	*/
	public void add(Address address) throws Exception;
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer [] ids) throws Exception;
}
