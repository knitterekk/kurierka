package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParcelStorageTest {
    @Test
    public void testParcelStoragesprawdzanieid() {
        ParcelStorage parcelStorage = new ParcelStorage();
        int parcelId = 1;

        boolean result = parcelStorage.findParcelById(parcelId) != null;

        assertTrue(result);
    }

    @Test
    public void testParcelStoragesprawdzanieidktoregoniema() {
        ParcelStorage parcelStorage = new ParcelStorage();
        int parcelId = 999;

        boolean result = parcelStorage.findParcelById(parcelId) != null;

        assertFalse(result);
    }
}
