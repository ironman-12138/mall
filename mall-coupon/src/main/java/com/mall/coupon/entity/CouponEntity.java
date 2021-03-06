package com.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 优惠券信息
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:24:00
 */
@Data
@TableName("sms_coupon")
public class CouponEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@ApiModelProperty(value = "id")
	@TableId
	private Long id;
	/**
	 * 优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]
	 */
	@ApiModelProperty(value = "优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]")
	private Integer couponType;
	/**
	 * 优惠券图片
	 */
	@ApiModelProperty(value = "优惠券图片")
	private String couponImg;
	/**
	 * 优惠卷名字
	 */
	@ApiModelProperty(value = "优惠卷名字")
	private String couponName;
	/**
	 * 数量
	 */
	@ApiModelProperty(value = "数量")
	private Integer num;
	/**
	 * 金额
	 */
	@ApiModelProperty(value = "金额")
	private BigDecimal amount;
	/**
	 * 每人限领张数
	 */
	@ApiModelProperty(value = "每人限领张数")
	private Integer perLimit;
	/**
	 * 使用门槛
	 */
	@ApiModelProperty(value = "使用门槛")
	private BigDecimal minPoint;
	/**
	 * 开始时间
	 */
	@ApiModelProperty(value = "开始时间")
	private Date startTime;
	/**
	 * 结束时间
	 */
	@ApiModelProperty(value = "结束时间")
	private Date endTime;
	/**
	 * 使用类型[0->全场通用；1->指定分类；2->指定商品]
	 */
	@ApiModelProperty(value = "使用类型[0->全场通用；1->指定分类；2->指定商品]")
	private Integer useType;
	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注")
	private String note;
	/**
	 * 发行数量
	 */
	@ApiModelProperty(value = "发行数量")
	private Integer publishCount;
	/**
	 * 已使用数量
	 */
	@ApiModelProperty(value = "已使用数量")
	private Integer useCount;
	/**
	 * 领取数量
	 */
	@ApiModelProperty(value = "领取数量")
	private Integer receiveCount;
	/**
	 * 可以领取的开始日期
	 */
	@ApiModelProperty(value = "可以领取的开始日期")
	private Date enableStartTime;
	/**
	 * 可以领取的结束日期
	 */
	@ApiModelProperty(value = "可以领取的结束日期")
	private Date enableEndTime;
	/**
	 * 优惠码
	 */
	@ApiModelProperty(value = "优惠码")
	private String code;
	/**
	 * 可以领取的会员等级[0->不限等级，其他-对应等级]
	 */
	@ApiModelProperty(value = "可以领取的会员等级[0->不限等级，其他-对应等级]")
	private Integer memberLevel;
	/**
	 * 发布状态[0-未发布，1-已发布]
	 */
	@ApiModelProperty(value = "发布状态[0-未发布，1-已发布]")
	private Integer publish;

}
