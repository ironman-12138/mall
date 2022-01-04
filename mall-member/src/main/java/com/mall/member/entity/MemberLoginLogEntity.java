package com.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 会员登录记录
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:38:37
 */
@Data
@TableName("ums_member_login_log")
public class MemberLoginLogEntity implements Serializable {
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
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间")
	private Date createTime;
	/**
	 * ip
	 */
	@ApiModelProperty(value = "ip")
	private String ip;
	/**
	 * city
	 */
	@ApiModelProperty(value = "city")
	private String city;
	/**
	 * 登录类型[1-web，2-app]
	 */
	@ApiModelProperty(value = "登录类型[1-web，2-app]")
	private Integer loginType;

}
