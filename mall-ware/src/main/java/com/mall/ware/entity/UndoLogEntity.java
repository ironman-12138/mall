package com.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

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
@TableName("undo_log")
public class UndoLogEntity implements Serializable {
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
	private Long branchId;
	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private String xid;
	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private String context;
	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private Longblob rollbackInfo;
	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private Integer logStatus;
	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private Date logCreated;
	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private Date logModified;
	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private String ext;

}
