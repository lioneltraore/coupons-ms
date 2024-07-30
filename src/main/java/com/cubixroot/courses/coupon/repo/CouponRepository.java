package com.cubixroot.courses.coupon.repo;

import com.cubixroot.courses.coupon.models.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
}
