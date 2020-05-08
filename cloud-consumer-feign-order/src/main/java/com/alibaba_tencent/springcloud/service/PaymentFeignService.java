package com.alibaba_tencent.springcloud.service;

import alibaba_tencent.entities.CommonResult;
import alibaba_tencent.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @auther ChenYong
 * @create 2020-02-19 23:59
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-PAYMENT")
public interface PaymentFeignService
{
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
