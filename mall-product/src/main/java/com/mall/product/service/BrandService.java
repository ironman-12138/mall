package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 22:44:36
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

