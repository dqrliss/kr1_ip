package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class hotelTest {

    @Test
    void setCity() {
        hotel h = new hotel("grodno");
        h.setCity("minsk");
        assertEquals("minsk", h.getCity());
    }

    @Test
    void setAmount() {
        hotel h = new hotel(4);
        h.setAmount(3);
        assertEquals(3, h.getAmount());
    }

    @Test
    void getCity() {
        hotel h = new hotel("minsk");
        assertEquals("minsk", h.getCity());
    }

    @Test
    void getAmount() {
        hotel h = new hotel(3);
        assertEquals(3, h.getAmount());
    }

}