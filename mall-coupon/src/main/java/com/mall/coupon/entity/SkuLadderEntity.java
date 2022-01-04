package com.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 商品阶梯价格
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:23:54
 */
@Data
@TableName("sms_sku_ladder")
public class SkuLadderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@ApiModelProperty(value = "id")
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	@ApiModelProperty(value = "spu_id")
	private Long skuId;
	/**
	 * 满几件
	 */
	@ApiModelProperty(value = "满几件")
	private Integer fullCount;
	/**
	 * 打几折
	 */
	@ApiModelProperty(value = "打几折")
	private BigDecimal discount;
	/**
	 * 折后价
	 */
	@ApiModelProperty(value = "折后价")
	private BigDecimal price;
	/**
	 * 是否叠加其他优惠[0-不可叠加，1-可叠加]
	 */
	@ApiModelProperty(value = "是否叠加其他优惠[0-不可叠加，1-可叠加]")
	private Integer addOther;

}
