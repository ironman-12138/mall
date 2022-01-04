package com.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 商品会员价格
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:23:53
 */
@Data
@TableName("sms_member_price")
public class MemberPriceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@ApiModelProperty(value = "id")
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	@ApiModelProperty(value = "sku_id")
	private Long skuId;
	/**
	 * 会员等级id
	 */
	@ApiModelProperty(value = "会员等级id")
	private Long memberLevelId;
	/**
	 * 会员等级名
	 */
	@ApiModelProperty(value = "会员等级名")
	private String memberLevelName;
	/**
	 * 会员对应价格
	 */
	@ApiModelProperty(value = "会员对应价格")
	private BigDecimal memberPrice;
	/**
	 * 可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
	 */
	@ApiModelProperty(value = "可否叠加其他优惠[0-不可叠加优惠，1-可叠加]")
	private Integer addOther;

}
