package com.offcn.service;

import java.util.List;

import com.offcn.po.Goods;


 
public interface GoodsService {
 
    List<Goods> getGoodsPager(int pageNO, int size);

    Goods getGoodsById(int id);
    
    int getGoodsCount();

    int insert(Goods entity);

    int delete(int id);

    int deletes(int[] ids);

    int update(Goods entity);

}
