package com.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 积分变化历史记录
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:38:37
 */
@Data
@TableName("ums_integration_change_history")
public class IntegrationChangeHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@ApiModelProperty(value = "id")
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	@ApiModelProperty(value = "member_id")
	private Long memberId;
	/**
	 * create_time
	 */
	@ApiModelProperty(value = "create_time")
	private Date createTime;
	/**
	 * 变化的值
	 */
	@ApiModelProperty(value = "变化的值")
	private Integer changeCount;
	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注")
	private String note;
	/**
	 * 来源[0->购物；1->管理员修改;2->活动]
	 */
	@ApiModelProperty(value = "来源[0->购物；1->管理员修改;2->活动]")
	private Integer sourceTyoe;

}
