package com.offcn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.offcn.mapper.GoodsDAO;
import com.offcn.po.Goods;
import com.offcn.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Resource
	GoodsDAO goodsdao;

	@Override
	public List<Goods> getGoodsPager(int pageNO, int size) {
		int skip = (pageNO - 1) * size;
		return goodsdao.getGoodsPager(skip, size);

	}

	@Override
	public Goods getGoodsById(int id) {
		return goodsdao.getGoodsById(id);
	}

	@Override
	public int getGoodsCount() {
		return goodsdao.getGoodsCount();
	}

	@Override
	public int insert(Goods entity) {
		
		return goodsdao.insert(entity);
	}

	@Override
	public int delete(int id) {
		
		return goodsdao.delete(id);
	}

	@Override
	public int deletes(int[] ids) {
		int rows = 0;
		for (int id : ids) {
			rows += delete(id);
		}
		return rows;
	}

	@Override
	public int update(Goods entity) {
		
		return goodsdao.update(entity);
	}

}
