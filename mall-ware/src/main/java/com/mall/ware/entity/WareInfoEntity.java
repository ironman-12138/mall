package com.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 仓库信息
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:51:27
 */
@Data
@TableName("wms_ware_info")
public class WareInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@ApiModelProperty(value = "id")
	@TableId
	private Long id;
	/**
	 * 仓库名
	 */
	@ApiModelProperty(value = "仓库名")
	private String name;
	/**
	 * 仓库地址
	 */
	@ApiModelProperty(value = "仓库地址")
	private String address;
	/**
	 * 区域编码
	 */
	@ApiModelProperty(value = "区域编码")
	private String areacode;

}
