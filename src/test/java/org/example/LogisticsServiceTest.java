package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class LogisticsServiceTest {
    @Mock
    private CourierStorage courierStorage;
    @Mock
    private ParcelStorage parcelMock;

    @InjectMocks
    private LogisticsService logisticsService;

    @Test
    void assignParcelToCourierdodaniepomyslnie() {
        int parcelId = 1;
        int courierId = 1;

        Parcel parcel = new Parcel(parcelId, "123 Main St", 5.0);
        when(parcelMock.findParcelById(parcelId)).thenReturn(parcel);
        Courier courier = new Courier(courierId, "John Doe", 10.0);
        when(courierStorage.findCourierById(courierId)).thenReturn(courier);


        boolean result = logisticsService.assignParcelToCourier(parcelId, courierId);

        assertTrue(result, "Parcel zostal dodany do Courier");

    }

    @Test
    void assignParcelToParcelpaecelnieistnieje() {
        int parcelId = 5;
        int courierId = 1;

        Parcel parcel = new Parcel(1, "123 Main St", 5.0);
        when(parcelMock.findParcelById(parcelId)).thenReturn(null);
        Courier courier = new Courier(courierId, "John Doe", 10.0);
        when(courierStorage.findCourierById(courierId)).thenReturn(courier);


        boolean result = logisticsService.assignParcelToCourier(parcelId, courierId);

        assertFalse(result, "Parcel nie istnieje");
    }

    @Test
    void assignParcelToParcelkuriernieistnieje() {
        int parcelId = 1;
        int courierId = 1;

        Parcel parcel = new Parcel(parcelId, "123 Main St", 5.0);
        when(parcelMock.findParcelById(parcelId)).thenReturn(parcel);
        Courier courier = new Courier(2, "John Doe", 10.0);
        when(courierStorage.findCourierById(courierId)).thenReturn(null);


        boolean result = logisticsService.assignParcelToCourier(parcelId, courierId);

        assertFalse(result, "Kurier nie istnieje");
    }

    @Test
    void assignParcelToParcelpaczkazaduzowazy() {
        double parcelWeight = 20.0;
        double courierMaxCapacity = 10.0;

        Parcel parcel = new Parcel(1, "dsdadsa", parcelWeight);
        when(parcelMock.findParcelById(1)).thenReturn(parcel);
        Courier courier = new Courier(2, "John Doe", courierMaxCapacity);
        when(courierStorage.findCourierById(2)).thenReturn(courier);

        boolean result = logisticsService.assignParcelToCourier(1, 2);

        assertFalse(result, "paczka wazy za duzo");
    }

    @Test
    void assignParcelToParcelpaczkatakasamajakmax() {
        double parcelWeight = 10.0;
        double courierMaxCapacity = 10.0;

        Parcel parcel = new Parcel(1, "dsdadsa", parcelWeight);
        when(parcelMock.findParcelById(1)).thenReturn(parcel);
        Courier courier = new Courier(2, "John Doe", courierMaxCapacity);
        when(courierStorage.findCourierById(2)).thenReturn(courier);

        boolean result = logisticsService.assignParcelToCourier(1, 2);

        assertTrue(result, "paczka zajmuje caly ciezar");
    }

    @Test
    void assignParcelToParcelpaczkadodanawczesniejdoinnego() {
        int parcelId = 1;
        int courierId = 1;
        int courierId2 = 2;


        Parcel parcel = new Parcel(parcelId, "dsdadsa", 2);
        when(parcelMock.findParcelById(1)).thenReturn(parcel);
        Courier courier = new Courier(courierId, "John Doe", 6);
        when(courierStorage.findCourierById(1)).thenReturn(courier);
        Courier courier1 = new Courier(courierId2, "John Doe", 6);
        when(courierStorage.findCourierById(2)).thenReturn(courier1);

        logisticsService.assignParcelToCourier(parcelId, courierId);
        boolean result1 = logisticsService.assignParcelToCourier(parcelId, courierId2);

        assertFalse(result1, "paczka wazy za duzo");
    }
}

