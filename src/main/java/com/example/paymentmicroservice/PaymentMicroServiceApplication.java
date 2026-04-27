package com.example.paymentmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PaymentMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMicroServiceApplication.class, args);
    }

}
