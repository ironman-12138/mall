package com.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 商品满减信息
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:23:54
 */
@Data
@TableName("sms_sku_full_reduction")
public class SkuFullReductionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@ApiModelProperty(value = "id")
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	@ApiModelProperty(value = "spu_id")
	private Long skuId;
	/**
	 * 满多少
	 */
	@ApiModelProperty(value = "满多少")
	private BigDecimal fullPrice;
	/**
	 * 减多少
	 */
	@ApiModelProperty(value = "减多少")
	private BigDecimal reducePrice;
	/**
	 * 是否参与其他优惠
	 */
	@ApiModelProperty(value = "是否参与其他优惠")
	private Integer addOther;

}
