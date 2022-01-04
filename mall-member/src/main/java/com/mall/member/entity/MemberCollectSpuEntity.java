package com.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 会员收藏的商品
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:38:37
 */
@Data
@TableName("ums_member_collect_spu")
public class MemberCollectSpuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@ApiModelProperty(value = "id")
	@TableId
	private Long id;
	/**
	 * 会员id
	 */
	@ApiModelProperty(value = "会员id")
	private Long memberId;
	/**
	 * spu_id
	 */
	@ApiModelProperty(value = "spu_id")
	private Long spuId;
	/**
	 * spu_name
	 */
	@ApiModelProperty(value = "spu_name")
	private String spuName;
	/**
	 * spu_img
	 */
	@ApiModelProperty(value = "spu_img")
	private String spuImg;
	/**
	 * create_time
	 */
	@ApiModelProperty(value = "create_time")
	private Date createTime;

}
