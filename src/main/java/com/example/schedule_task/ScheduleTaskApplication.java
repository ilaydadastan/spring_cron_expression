package com.example.schedule_task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class ScheduleTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduleTaskApplication.class, args);
    }

  // 0 0 1 1 *  @yearly
    @Scheduled(cron = " 0 0 15 22 3 3 * , zone=\"Europe/Istanbul" )
    public void scheduling(){
        System.out.println("Happy Birthday!");
    }

}




