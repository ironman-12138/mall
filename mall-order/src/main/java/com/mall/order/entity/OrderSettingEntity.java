package com.mall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 订单配置信息
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:46:55
 */
@Data
@TableName("oms_order_setting")
public class OrderSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@ApiModelProperty(value = "id")
	@TableId
	private Long id;
	/**
	 * 秒杀订单超时关闭时间(分)
	 */
	@ApiModelProperty(value = "秒杀订单超时关闭时间(分)")
	private Integer flashOrderOvertime;
	/**
	 * 正常订单超时时间(分)
	 */
	@ApiModelProperty(value = "正常订单超时时间(分)")
	private Integer normalOrderOvertime;
	/**
	 * 发货后自动确认收货时间（天）
	 */
	@ApiModelProperty(value = "发货后自动确认收货时间（天）")
	private Integer confirmOvertime;
	/**
	 * 自动完成交易时间，不能申请退货（天）
	 */
	@ApiModelProperty(value = "自动完成交易时间，不能申请退货（天）")
	private Integer finishOvertime;
	/**
	 * 订单完成后自动好评时间（天）
	 */
	@ApiModelProperty(value = "订单完成后自动好评时间（天）")
	private Integer commentOvertime;
	/**
	 * 会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】
	 */
	@ApiModelProperty(value = "会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】")
	private Integer memberLevel;

}