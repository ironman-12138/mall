package com.mall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mall.product.entity.CategoryEntity;
import com.mall.product.service.CategoryService;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.R;



/**
 * 商品三级分类
 *
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 22:44:35
 */
@RestController
@RequestMapping("product/category")
@Api(value = "商品三级分类", tags = {"商品三级分类"})
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 商品三级分类树形结构
     */
    @PostMapping("login")
    @ApiOperation("商品三级分类")
    public R getCategoryTree(){
        List<CategoryEntity> list = categoryService.getCategoryTree();
        return R.ok(list);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = categoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] catIds){
		categoryService.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
