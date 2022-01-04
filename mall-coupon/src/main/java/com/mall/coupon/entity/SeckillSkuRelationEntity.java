package com.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 秒杀活动商品关联
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:23:53
 */
@Data
@TableName("sms_seckill_sku_relation")
public class SeckillSkuRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@ApiModelProperty(value = "id")
	@TableId
	private Long id;
	/**
	 * 活动id
	 */
	@ApiModelProperty(value = "活动id")
	private Long promotionId;
	/**
	 * 活动场次id
	 */
	@ApiModelProperty(value = "活动场次id")
	private Long promotionSessionId;
	/**
	 * 商品id
	 */
	@ApiModelProperty(value = "商品id")
	private Long skuId;
	/**
	 * 秒杀价格
	 */
	@ApiModelProperty(value = "秒杀价格")
	private BigDecimal seckillPrice;
	/**
	 * 秒杀总量
	 */
	@ApiModelProperty(value = "秒杀总量")
	private BigDecimal seckillCount;
	/**
	 * 每人限购数量
	 */
	@ApiModelProperty(value = "每人限购数量")
	private BigDecimal seckillLimit;
	/**
	 * 排序
	 */
	@ApiModelProperty(value = "排序")
	private Integer seckillSort;

}
