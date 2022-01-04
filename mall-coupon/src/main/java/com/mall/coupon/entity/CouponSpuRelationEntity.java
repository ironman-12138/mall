package com.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 优惠券与产品关联
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:24:00
 */
@Data
@TableName("sms_coupon_spu_relation")
public class CouponSpuRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@ApiModelProperty(value = "id")
	@TableId
	private Long id;
	/**
	 * 优惠券id
	 */
	@ApiModelProperty(value = "优惠券id")
	private Long couponId;
	/**
	 * spu_id
	 */
	@ApiModelProperty(value = "spu_id")
	private Long spuId;
	/**
	 * spu_name
	 */
	@ApiModelProperty(value = "spu_name")
	private String spuName;

}
