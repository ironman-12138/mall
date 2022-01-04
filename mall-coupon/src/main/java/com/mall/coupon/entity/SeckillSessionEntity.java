package com.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 秒杀活动场次
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:23:53
 */
@Data
@TableName("sms_seckill_session")
public class SeckillSessionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@ApiModelProperty(value = "id")
	@TableId
	private Long id;
	/**
	 * 场次名称
	 */
	@ApiModelProperty(value = "场次名称")
	private String name;
	/**
	 * 每日开始时间
	 */
	@ApiModelProperty(value = "每日开始时间")
	private Date startTime;
	/**
	 * 每日结束时间
	 */
	@ApiModelProperty(value = "每日结束时间")
	private Date endTime;
	/**
	 * 启用状态
	 */
	@ApiModelProperty(value = "启用状态")
	private Integer status;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间")
	private Date createTime;

}
