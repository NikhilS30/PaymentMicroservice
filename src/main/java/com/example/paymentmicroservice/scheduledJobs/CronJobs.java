package com.example.paymentmicroservice.scheduledJobs;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronJobs {

    @Scheduled(cron = "*/1 * * * * *")
    public void scheduler(){
        System.out.println("running via cron job");
    }
}
