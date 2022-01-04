package com.mall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 退货原因
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:46:54
 */
@Data
@TableName("oms_order_return_reason")
public class OrderReturnReasonEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@ApiModelProperty(value = "id")
	@TableId
	private Long id;
	/**
	 * 退货原因名
	 */
	@ApiModelProperty(value = "退货原因名")
	private String name;
	/**
	 * 排序
	 */
	@ApiModelProperty(value = "排序")
	private Integer sort;
	/**
	 * 启用状态
	 */
	@ApiModelProperty(value = "启用状态")
	private Integer status;
	/**
	 * create_time
	 */
	@ApiModelProperty(value = "create_time")
	private Date createTime;

}
