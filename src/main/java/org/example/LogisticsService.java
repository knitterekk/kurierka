package org.example;

import org.springframework.stereotype.Component;

@Component
public class LogisticsService {
    private final ParcelStorage parcelStorage;
    private final CourierStorage courierStorage;
    public LogisticsService(ParcelStorage parcelStorage,CourierStorage courierStorage ) {
        this.parcelStorage = parcelStorage;
        this.courierStorage = courierStorage;
    }
    public boolean assignParcelToCourier(int parcelId, int courierId) {
        Parcel parcel = (Parcel) parcelStorage.findParcelById(parcelId);
        Courier courier = (Courier) CourierStorage.findCourierById(courierId);

        if (parcel == null || courier == null) {
            return false; // Parcel or Courier not found
        }

        if (parcel.isAssigned()) {
            return false; // Parcel is already assigned
        }

        if (courier.getCurrentLoad() + parcel.getWeight() > courier.getMaxCapacity()) {
            return false; // Exceeds courier's capacity
        }

        // Assign parcel to courier
        parcel.setAssigned(true);
        courier.setCurrentLoad(courier.getCurrentLoad() + parcel.getWeight());
        System.out.println("Assigned parcel " + parcelId + " to courier " + courierId);
        return true;
    }


}
