package com.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 会员收藏的专题活动
 * 
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:38:38
 */
@Data
@TableName("ums_member_collect_subject")
public class MemberCollectSubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@ApiModelProperty(value = "id")
	@TableId
	private Long id;
	/**
	 * subject_id
	 */
	@ApiModelProperty(value = "subject_id")
	private Long subjectId;
	/**
	 * subject_name
	 */
	@ApiModelProperty(value = "subject_name")
	private String subjectName;
	/**
	 * subject_img
	 */
	@ApiModelProperty(value = "subject_img")
	private String subjectImg;
	/**
	 * 活动url
	 */
	@ApiModelProperty(value = "活动url")
	private String subjectUrll;

}
