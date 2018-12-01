package com.xxx.dao;

import com.xxx.domain.Product;

import java.util.List;

public interface ProductDao {

    /**
     * 查询所有的方法
     */
    List<Product> findAllProduct();
}


