package com.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 秒杀活动
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:23:53
 */
@Data
@TableName("sms_seckill_promotion")
public class SeckillPromotionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@ApiModelProperty(value = "id")
	@TableId
	private Long id;
	/**
	 * 活动标题
	 */
	@ApiModelProperty(value = "活动标题")
	private String title;
	/**
	 * 开始日期
	 */
	@ApiModelProperty(value = "开始日期")
	private Date startTime;
	/**
	 * 结束日期
	 */
	@ApiModelProperty(value = "结束日期")
	private Date endTime;
	/**
	 * 上下线状态
	 */
	@ApiModelProperty(value = "上下线状态")
	private Integer status;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间")
	private Date createTime;
	/**
	 * 创建人
	 */
	@ApiModelProperty(value = "创建人")
	private Long userId;

}
