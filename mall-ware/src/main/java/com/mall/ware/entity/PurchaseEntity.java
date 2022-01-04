package com.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 采购信息
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:51:27
 */
@Data
@TableName("wms_purchase")
public class PurchaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	@TableId
	private Long id;
	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private Long assigneeId;
	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private String assigneeName;
	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private String phone;
	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private Integer priority;
	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private Integer status;
	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private Long wareId;
	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private BigDecimal amount;
	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private Date createTime;
	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private Date updateTime;

}
