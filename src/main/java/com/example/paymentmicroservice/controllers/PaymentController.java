package com.example.paymentmicroservice.controllers;

import com.example.paymentmicroservice.dtos.GeneratePaymentLinkRequestDto;
import com.example.paymentmicroservice.services.PaymentService;
import com.example.paymentmicroservice.services.RazorpayPaymentGateway;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    PaymentService paymentService;

    public PaymentController(@Qualifier("StripePaymentGateway") PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping()
    public String generatePaymentLink(@RequestBody GeneratePaymentLinkRequestDto requestDto) throws RazorpayException {
        return paymentService.generatePaymentLink(requestDto.getOrderId());
    }

    /*this we will integrate in razorpay dashboard to update payment status in orders db final status jo ki
     abhi pending state mein hai this is basically to sync razorpay db with orders db
    */
    @PostMapping("/webhook")
    public  void webhookEvent(){
        System.out.println("Webhook got triggered");
    }
}