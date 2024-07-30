package com.cubixroot.courses.coupon.services;

import com.cubixroot.courses.coupon.models.Coupon;
import com.cubixroot.courses.coupon.repo.CouponRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CouponService {

    private CouponRepository couponRepository;

    public CouponService(CouponRepository couponRepository) {
        this.couponRepository = couponRepository;
    }

    public Coupon createCoupon(Coupon coupon) {
        if(coupon.getCode().equals("BONUS")) {
            coupon.setDiscount(BigDecimal.valueOf(200));
        }

        return couponRepository.save(coupon);
    }

    public List<Coupon> findAll() {
        return couponRepository.findAll();
    }
}
