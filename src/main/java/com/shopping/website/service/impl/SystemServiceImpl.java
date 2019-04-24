
package com.shopping.website.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.website.dao.SystemDao;
import com.shopping.website.pojo.Address;
import com.shopping.website.pojo.System;
import com.shopping.website.pojo.SystemExample;
import com.shopping.website.pojo.SystemExample.Criteria;
import com.shopping.website.service.SystemService;


@Service
public class SystemServiceImpl implements SystemService {

	@Autowired
	private SystemDao dao;
	
	@Override
	@Transactional
	public void addMessage(System system)  throws Exception{
		dao.insert(system);		
	}
}
