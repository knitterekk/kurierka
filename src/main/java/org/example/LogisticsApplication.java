package org.example; // Lub com.example.sevice - zależy jak nazwałeś pakiet przy tworzeniu projektu

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogisticsApplication {


    public LogisticsApplication(LogisticsService logisticsService) {


    }

    public static void main(String[] args) {
        SpringApplication.run(LogisticsApplication.class, args);
    }
}