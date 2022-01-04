package com.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 库存工作单
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:51:26
 */
@Data
@TableName("wms_ware_order_task_detail")
public class WareOrderTaskDetailEntity implements Serializable {
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
	 * sku_name
	 */
	@ApiModelProperty(value = "sku_name")
	private String skuName;
	/**
	 * 购买个数
	 */
	@ApiModelProperty(value = "购买个数")
	private Integer skuNum;
	/**
	 * 工作单id
	 */
	@ApiModelProperty(value = "工作单id")
	private Long taskId;
	/**
	 * 仓库id
	 */
	@ApiModelProperty(value = "仓库id")
	private Long wareId;
	/**
	 * 1-已锁定  2-已解锁  3-扣减
	 */
	@ApiModelProperty(value = "1-已锁定  2-已解锁  3-扣减")
	private Integer lockStatus;

}
