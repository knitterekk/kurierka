package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest(classes = LogisticsApplication.class)
class LogisticsServiceIntegrationTest {

    @Autowired
    LogisticsService logisticsService;

    @Test
    void przypisaniedwarazytejsamejpaczki() {
        int parcelId = 1;
        int courierId = 1;

        boolean tak = logisticsService.assignParcelToCourier(parcelId, courierId);


        assertTrue(tak, "Pierwsze przypisanie powinno się udać");
        boolean result = logisticsService.assignParcelToCourier(parcelId, courierId);
        assertFalse(result, "Drugie przypisanie powinno się nie udać");
    }
}