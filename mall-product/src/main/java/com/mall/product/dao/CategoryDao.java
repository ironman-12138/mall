package com.mall.product.dao;

import com.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 22:44:35
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
