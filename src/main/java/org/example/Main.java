package org.example; // Lub com.example.sevice - zależy jak nazwałeś pakiet przy tworzeniu projektu

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {


    public Main(LogisticsService logisticsService) {
        logisticsService.assignParcelToCourier(1, 1);
        logisticsService.assignParcelToCourier( 2, 2);
        logisticsService.assignParcelToCourier( 3, 103);


    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}