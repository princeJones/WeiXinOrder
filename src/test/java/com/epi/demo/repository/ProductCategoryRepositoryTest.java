package com.epi.demo.repository;

import com.epi.demo.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest
{
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest()
    {
        List<ProductCategory> productCategory= repository.findAll();

        Iterator it=productCategory.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    @Test

    public void SaveTest()
    {
        ProductCategory productCategory=new ProductCategory();

        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(10);
       ProductCategory result= repository.save(productCategory);

        Assert.assertNotNull(result);

    }

    @Test
    public void findByCategoryTypeIn()
    {
        List<Integer> list= Arrays.asList(16);
	System.out.Println();


    }
}