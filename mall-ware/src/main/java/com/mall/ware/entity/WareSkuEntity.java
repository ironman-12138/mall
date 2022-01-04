package com.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 商品库存
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:51:26
 */
@Data
@TableName("wms_ware_sku")
public class WareSkuEntity implements Serializable {
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
	 * 仓库id
	 */
	@ApiModelProperty(value = "仓库id")
	private Long wareId;
	/**
	 * 库存数
	 */
	@ApiModelProperty(value = "库存数")
	private Integer stock;
	/**
	 * sku_name
	 */
	@ApiModelProperty(value = "sku_name")
	private String skuName;
	/**
	 * 锁定库存
	 */
	@ApiModelProperty(value = "锁定库存")
	private Integer stockLocked;

}
