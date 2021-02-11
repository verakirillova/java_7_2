package ru.netology.domains;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioAdvancedTest {

    @Test
    public void testVolume () {
        RadioAdvanced radio = new RadioAdvanced();

        radio.setMinVolume(0);
        radio.setMaxVolume(10);

        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());

        radio.setCurrentVolume(15);
        assertEquals(5, radio.getCurrentVolume());

        radio.setCurrentVolume(-1);
        assertEquals(5, radio.getCurrentVolume());

        radio.setCurrentVolume(9);
        assertEquals(9, radio.getCurrentVolume());

        radio.plusVolume();
        assertEquals(10, radio.getCurrentVolume());

        radio.plusVolume();
        assertEquals(10, radio.getCurrentVolume());

        radio.setCurrentVolume(1);
        assertEquals(1, radio.getCurrentVolume());

        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());

        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void testRadio () {
        RadioAdvanced radio = new RadioAdvanced();

        radio.setMinRadio(0);
        radio.setMaxRadio(9);

        assertEquals(0, radio.getCurrentRadio());
        radio.setCurrentRadio(5);
        assertEquals(5, radio.getCurrentRadio());

        radio.setCurrentRadio(10);
        assertEquals(0, radio.getCurrentRadio());

        radio.setCurrentRadio(-1);
        assertEquals(9, radio.getCurrentRadio());

        radio.prevRadio();
        assertEquals(8, radio.getCurrentRadio());

        radio.nextRadio();
        assertEquals(9, radio.getCurrentRadio());

        radio.nextRadio();
        assertEquals(0, radio.getCurrentRadio());

        radio.prevRadio();
        assertEquals(9, radio.getCurrentRadio());

        }
}



