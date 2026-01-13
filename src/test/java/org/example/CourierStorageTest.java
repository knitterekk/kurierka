package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CourierStorageTest {
    @Test
    public void findCourierByIdTestdzialapoprawnie() {
        CourierStorage courierStorage = new CourierStorage();
        int id = 1;

        boolean result = courierStorage.findCourierById(id) != null;
        assertTrue(result);

    }

    @Test
    public void findCourierByIdTestniematakiegoid() {
        CourierStorage courierStorage = new CourierStorage();
        int id = 999;

        boolean result = courierStorage.findCourierById(id) != null;
        assertFalse(result);

    }
}
