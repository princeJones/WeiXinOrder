package com.epi.demo.service.Imp;

import com.epi.demo.dataobject.ProductCategory;
import com.epi.demo.service.CategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImpTest
{
    @Autowired
    private CategoryServiceImp categoryServiceImp;

    @Test
    public void findOne()
    {
        ProductCategory productCategory=categoryServiceImp.findOne(16);
        Assert.assertEquals(new Integer(16),productCategory.getCategoryId());
    }

    @Test
    public void findAll()
    {
        List<ProductCategory> productCategoryList=categoryServiceImp.findAll();
//        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void findByCategoryType()
    {
        List<ProductCategory> productCategoryList=categoryServiceImp.findByCategoryType(Arrays.asList(1,2,3,4));
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void save()
    {
        ProductCategory productCategory=new ProductCategory("男生专享",13);
        ProductCategory result=categoryServiceImp.save(productCategory);
        Assert.assertNotNull(result);

    }
}