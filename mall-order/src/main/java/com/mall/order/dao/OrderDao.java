package com.mall.order.dao;

import com.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:46:55
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
