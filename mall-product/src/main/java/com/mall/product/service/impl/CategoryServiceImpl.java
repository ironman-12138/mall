package com.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.Query;

import com.mall.product.dao.CategoryDao;
import com.mall.product.entity.CategoryEntity;
import com.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> getCategoryTree() {
        List<CategoryEntity> list = baseMapper.selectList(new QueryWrapper<CategoryEntity>().eq("show_status", 1).orderByAsc("sort"));
        List<CategoryEntity> collect = list.stream().filter(categoryEntity -> {
            return categoryEntity.getCatLevel() == 1;
        }).collect(Collectors.toList());

        collect.forEach(item ->{
            item.setChildren(getChildren(item, list));
        });
        return collect;
    }

    public List<CategoryEntity> getChildren(CategoryEntity categoryEntity, List<CategoryEntity> allList) {
        List<CategoryEntity> collect = allList.stream().filter(categoryEntity1 -> {
            return categoryEntity1.getParentCid().equals(categoryEntity.getCatId());
        }).map(categoryEntity1 -> {
            categoryEntity1.setChildren(getChildren(categoryEntity1, allList));
            return categoryEntity1;
        }).collect(Collectors.toList());
        return collect;
    }

}