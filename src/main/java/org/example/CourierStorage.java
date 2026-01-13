package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourierStorage {
    private List<Courier> couriers;

    public CourierStorage() {
        this.couriers = new ArrayList<>();

        couriers.add(new Courier(1, "FastExpress", 50.0));
        couriers.add(new Courier(2, "QuickShip", 30.0));
    }

    public Courier findCourierById(int id) {

        for (Courier courier : couriers) {
            if (courier.getId() == id) {
                return courier;
            }
        }
        return null;
    }
}
