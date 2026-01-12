package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ParcelStorage {
    private List<Parcel> parcels;

    public ParcelStorage(List<Parcel> parcels) {
        this.parcels = new ArrayList<>(parcels);

        parcels.add(new Parcel(1, "123 Main St, Springfield", 2.5));
        parcels.add(new Parcel(2, "456 Elm St, Shelbyville", 1.2));
        parcels.add(new Parcel(3, "789 Oak St, Capital City", 3.8));
    }

    public List<Parcel> findParcelById(int id) {
        List<Parcel> result = new ArrayList<>();
        for (Parcel parcel : parcels) {
            if (parcel.getId() == id) {
                result.add(parcel);
            }
        }
        return result;
    }

}
