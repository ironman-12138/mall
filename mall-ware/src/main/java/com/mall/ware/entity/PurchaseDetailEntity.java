package com.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:51:27
 */
@Data
@TableName("wms_purchase_detail")
public class PurchaseDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	@TableId
	private Long id;
	/**
	 * 采购单id
	 */
	@ApiModelProperty(value = "采购单id")
	private Long purchaseId;
	/**
	 * 采购商品id
	 */
	@ApiModelProperty(value = "采购商品id")
	private Long skuId;
	/**
	 * 采购数量
	 */
	@ApiModelProperty(value = "采购数量")
	private Integer skuNum;
	/**
	 * 采购金额
	 */
	@ApiModelProperty(value = "采购金额")
	private BigDecimal skuPrice;
	/**
	 * 仓库id
	 */
	@ApiModelProperty(value = "仓库id")
	private Long wareId;
	/**
	 * 状态[0新建，1已分配，2正在采购，3已完成，4采购失败]
	 */
	@ApiModelProperty(value = "状态[0新建，1已分配，2正在采购，3已完成，4采购失败]")
	private Integer status;

}
