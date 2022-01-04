package com.mall;

import static org.junit.Assert.assertTrue;

import com.mall.product.entity.BrandEntity;
import com.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    @Resource
    private BrandService brandService;

    @Test
    public void shouldAnswerWithTrue() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        boolean save = brandService.save(brandEntity);
        if (save) {
            System.out.println("-----------------------保存成功-----------------------");
        }
    }
}
