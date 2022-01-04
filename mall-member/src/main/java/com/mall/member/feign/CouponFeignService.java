package com.mall.member.feign;

import com.mall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 优惠卷远程调用服务
 * @author xCoder
 */
@FeignClient("mall-coupon")
public interface CouponFeignService {

    @RequestMapping("coupon/coupon/test")
    public R test();

}
