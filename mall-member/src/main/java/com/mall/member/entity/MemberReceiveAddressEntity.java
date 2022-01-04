package com.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 会员收货地址
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:38:37
 */
@Data
@TableName("ums_member_receive_address")
public class MemberReceiveAddressEntity implements Serializable {
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
	 * 收货人姓名
	 */
	@ApiModelProperty(value = "收货人姓名")
	private String name;
	/**
	 * 电话
	 */
	@ApiModelProperty(value = "电话")
	private String phone;
	/**
	 * 邮政编码
	 */
	@ApiModelProperty(value = "邮政编码")
	private String postCode;
	/**
	 * 省份/直辖市
	 */
	@ApiModelProperty(value = "省份/直辖市")
	private String province;
	/**
	 * 城市
	 */
	@ApiModelProperty(value = "城市")
	private String city;
	/**
	 * 区
	 */
	@ApiModelProperty(value = "区")
	private String region;
	/**
	 * 详细地址(街道)
	 */
	@ApiModelProperty(value = "详细地址(街道)")
	private String detailAddress;
	/**
	 * 省市区代码
	 */
	@ApiModelProperty(value = "省市区代码")
	private String areacode;
	/**
	 * 是否默认
	 */
	@ApiModelProperty(value = "是否默认")
	private Integer defaultStatus;

}
