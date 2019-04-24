package com.shopping.website.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.website.comonPojo.PageResult;
import com.shopping.website.dao.TbGoodsDao;
import com.shopping.website.pojo.TbGoods;
import com.shopping.website.pojo.TbGoodsExample;
import com.shopping.website.pojo.TbGoodsExample.Criteria;
import com.shopping.website.service.TbgoodsService;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TbgoodsServiceImpl implements TbgoodsService {

	@Autowired
	private TbGoodsDao dao;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbGoods> findAll()  throws Exception{
		return dao.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(Integer pageNum, Integer pageSize)  throws Exception{
		TbGoodsExample example=new TbGoodsExample();
		if(pageNum != null && pageSize != null) {
			if(pageNum != 0 && pageSize != 0) {

				example.setPageNo(pageNum);
				example.setPageSize(pageSize);
			}
		}
		Integer count = dao.countByExample(null);		
		List<TbGoods> list = dao.selectByExample(example);
		return new PageResult(count, list );
	}

	/**
	 * 增加
	 */
	@Transactional
	@Override
	public void add(TbGoods tbgoods)  throws Exception{
		dao.insert(tbgoods);		
	}

	
	/**
	 * 修改
	 */
	@Override
	@Transactional
	public void update(TbGoods tbgoods) throws Exception{
		dao.updateByPrimaryKey(tbgoods);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbGoods findOne(Integer id) throws Exception{
		return dao.selectByPrimaryKey(id);
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
	
	/**
	 *条件分页查询
	 */
	@Override
	public PageResult findPage(TbGoods tbgoods, Integer pageNum, Integer pageSize)  throws Exception{
		
		TbGoodsExample example=new TbGoodsExample();
		Criteria criteria = example.createCriteria();
		
		if(tbgoods!=null){			
						if(tbgoods.getGoodstitle()!=null && tbgoods.getGoodstitle().length()>0){
				criteria.andGoodstitleLike("%"+tbgoods.getGoodstitle()+"%");
			}
			if(tbgoods.getGoodsimg()!=null && tbgoods.getGoodsimg().length()>0){
				criteria.andGoodsimgLike("%"+tbgoods.getGoodsimg()+"%");
			}
	
		}
		Integer count = dao.countByExample(null);
		if(pageNum != null && pageSize != null) {
			if(pageNum != 0 && pageSize != 0) {

				example.setPageNo(pageNum);
				example.setPageSize(pageSize);
			}
		}		
		List<TbGoods> list = dao.selectByExample(example);
		return new PageResult(count, list );
	}
	
}
