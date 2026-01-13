package org.example; // Lub com.example.sevice - zależy jak nazwałeś pakiet przy tworzeniu projektu

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {


    public Main(LogisticsService logisticsService) {


    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}