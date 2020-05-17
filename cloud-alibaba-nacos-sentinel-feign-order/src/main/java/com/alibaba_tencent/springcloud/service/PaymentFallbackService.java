package com.alibaba_tencent.springcloud.service;

import alibaba_tencent.entities.CommonResult;
import alibaba_tencent.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @auther ChenYong
 * @create 2020-02-25 18:30
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }

    @Override
    public CommonResult<Payment> getLimitUrl(Long id) {
        return new CommonResult<>(44444,"服务限流,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
