package com.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 优惠券领取历史记录
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:24:00
 */
@Data
@TableName("sms_coupon_history")
public class CouponHistoryEntity implements Serializable {
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
	 * 会员id
	 */
	@ApiModelProperty(value = "会员id")
	private Long memberId;
	/**
	 * 会员名字
	 */
	@ApiModelProperty(value = "会员名字")
	private String memberNickName;
	/**
	 * 获取方式[0->后台赠送；1->主动领取]
	 */
	@ApiModelProperty(value = "获取方式[0->后台赠送；1->主动领取]")
	private Integer getType;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间")
	private Date createTime;
	/**
	 * 使用状态[0->未使用；1->已使用；2->已过期]
	 */
	@ApiModelProperty(value = "使用状态[0->未使用；1->已使用；2->已过期]")
	private Integer useType;
	/**
	 * 使用时间
	 */
	@ApiModelProperty(value = "使用时间")
	private Date useTime;
	/**
	 * 订单id
	 */
	@ApiModelProperty(value = "订单id")
	private Long orderId;
	/**
	 * 订单号
	 */
	@ApiModelProperty(value = "订单号")
	private Long orderSn;

}
