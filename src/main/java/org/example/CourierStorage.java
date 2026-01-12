package org.example;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourierStorage {
    private static List<Courier> couriers;

    public CourierStorage(List<Courier> couriers) {
        this.couriers = couriers;

        couriers.add(new Courier(1, "FastExpress", 50.0));
        couriers.add(new Courier(2, "QuickShip", 30.0));
    }

    public static List<Courier> findCourierById(int id) {
        List<Courier> result = new java.util.ArrayList<>();
        for (Courier courier : couriers) {
            if (courier.getId() == id) {
                result.add(courier);
            }
        }
        return result;
    }
}
