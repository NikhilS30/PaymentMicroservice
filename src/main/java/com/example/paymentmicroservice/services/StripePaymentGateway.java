package com.example.paymentmicroservice.services;

import com.razorpay.RazorpayException;
import org.springframework.stereotype.Service;

@Service("StripePaymentGateway")
public class StripePaymentGateway implements PaymentService{
    @Override
    public String generatePaymentLink(Long orderId) throws RazorpayException {
        //make a call to stripe payment gateway to generate payment link
        return "";
    }
}
