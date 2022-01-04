package com.mall.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.mall.member.feign.CouponFeignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mall.member.entity.MemberEntity;
import com.mall.member.service.MemberService;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.R;



/**
 * 会员
 *
 * @author xCoder
 * @email 1481806085@qq.com
 * @date 2022-01-01 23:38:37
 */
@RestController
@RequestMapping("member/member")
@Api(value = "会员管理", tags = {"会员管理"})
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    private CouponFeignService couponFeignService;

    /**
     * 远程调用会员服务接口
     */
    @RequestMapping("/test")
    @ApiOperation("远程调用会员服务接口")
    public R test(){
        R test = couponFeignService.test();
        return test;
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    @ApiOperation("列表")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @ApiOperation("信息")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @ApiOperation("保存")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @ApiOperation("修改")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @ApiOperation("删除")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
