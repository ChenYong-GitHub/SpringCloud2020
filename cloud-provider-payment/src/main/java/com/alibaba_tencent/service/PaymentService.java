package com.alibaba_tencent.service;

import alibaba_tencent.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auther ChenYong
 * @create 2020-02-18 10:40
 */
public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
