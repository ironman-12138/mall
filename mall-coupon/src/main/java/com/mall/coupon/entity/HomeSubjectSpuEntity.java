package com.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 专题商品
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:23:53
 */
@Data
@TableName("sms_home_subject_spu")
public class HomeSubjectSpuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@ApiModelProperty(value = "id")
	@TableId
	private Long id;
	/**
	 * 专题名字
	 */
	@ApiModelProperty(value = "专题名字")
	private String name;
	/**
	 * 专题id
	 */
	@ApiModelProperty(value = "专题id")
	private Long subjectId;
	/**
	 * spu_id
	 */
	@ApiModelProperty(value = "spu_id")
	private Long spuId;
	/**
	 * 排序
	 */
	@ApiModelProperty(value = "排序")
	private Integer sort;

}
