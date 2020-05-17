package com.alibaba_tencent.springcloud.service;

import alibaba_tencent.entities.CommonResult;
import alibaba_tencent.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @auther zzyy
 * @create 2020-02-25 18:15
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> getLimitUrl(@PathVariable("id") Long id);
}
