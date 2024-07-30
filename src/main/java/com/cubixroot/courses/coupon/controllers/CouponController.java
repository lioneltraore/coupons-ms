package com.cubixroot.courses.coupon.controllers;

import com.cubixroot.courses.coupon.models.Coupon;
import com.cubixroot.courses.coupon.services.CouponService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CouponController {

    private CouponService couponService;

    public CouponController(CouponService couponService) {
        this.couponService = couponService;
    }

    @PostMapping("/coupons")
    public Coupon createCoupon(@RequestBody Coupon coupon) {
        return couponService.createCoupon(coupon);
    }

    @GetMapping("/coupons")
    public List<Coupon> findAll() {
        return couponService.findAll();
    }

    @GetMapping("/coupons/{code}")
    public Coupon findByCode(@PathVariable String code) {
        return couponService.findByCode(code);
    }
}
