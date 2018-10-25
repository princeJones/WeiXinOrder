package com.epi.demo.service;

import com.epi.demo.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService
{

    ProductCategory findOne(Integer categoryId);


    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryType(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
