package ru.netology.domains;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioAdvancedTest {

    @Test
    public void testPlusVolume() {
        RadioAdvanced radio = new RadioAdvanced();

        radio.setMinVolume(0);
        radio.setMaxVolume(10);

        radio.setCurrentVolume(radio.getMinVolume());
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());

        radio.plusVolume();
        assertEquals(radio.getMinVolume()+1, radio.getCurrentVolume());

        radio.plusVolume();
        assertEquals(radio.getMinVolume()+2, radio.getCurrentVolume());
    }

    @Test
    public void testMaxVolume() {
        RadioAdvanced radio = new RadioAdvanced();

        radio.setMinVolume(0);
        radio.setMaxVolume(10);

        radio.setCurrentVolume(radio.getMaxVolume());
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());

        radio.plusVolume();
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    public void testMinusVolume() {
        RadioAdvanced radio = new RadioAdvanced();

        radio.setMinVolume(0);
        radio.setMaxVolume(10);

        radio.setCurrentVolume(radio.getMaxVolume());
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());

        radio.minusVolume();
        assertEquals(radio.getMaxVolume()-1, radio.getCurrentVolume());

        radio.minusVolume();
        assertEquals(radio.getMaxVolume()-2, radio.getCurrentVolume());
    }

    @Test
    public void testMinVolume() {
        RadioAdvanced radio = new RadioAdvanced();

        radio.setMinVolume(0);
        radio.setMaxVolume(10);

        radio.setCurrentVolume(radio.getMinVolume());
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());

        radio.minusVolume();
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

    @Test
    public void testRadioNext() {
        RadioAdvanced radio = new RadioAdvanced();

        radio.setMinRadio(0);
        radio.setMaxRadio(9);

        radio.setCurrentRadio(radio.getMinRadio());
        assertEquals(radio.getMinRadio(), radio.getCurrentRadio());

        radio.nextRadio();
        assertEquals(radio.getMinRadio()+1, radio.getCurrentRadio());

        radio.nextRadio();
        assertEquals(radio.getMinRadio()+2, radio.getCurrentRadio());
    }

    @Test
    public void testRadioPrev() {
        RadioAdvanced radio = new RadioAdvanced();

        radio.setMinRadio(0);
        radio.setMaxRadio(9);

        radio.setCurrentRadio(radio.getMaxRadio());
        assertEquals(radio.getMaxRadio(), radio.getCurrentRadio());

        radio.prevRadio();
        assertEquals(radio.getMaxRadio()-1, radio.getCurrentRadio());

        radio.prevRadio();
        assertEquals(radio.getMaxRadio()-2, radio.getCurrentRadio());
    }

    @Test
    public void testMaxRadio() {
        RadioAdvanced radio = new RadioAdvanced();

        radio.setMinRadio(0);
        radio.setMaxRadio(9);

        radio.setCurrentRadio(radio.getMaxRadio());
        assertEquals(radio.getMaxRadio(), radio.getCurrentRadio());

        radio.nextRadio();
        assertEquals(radio.getMinRadio(), radio.getCurrentRadio());
    }

    @Test
    public void testMinRadioB() {
        RadioAdvanced radio = new RadioAdvanced();

        radio.setMinRadio(0);
        radio.setMaxRadio(9);

        radio.setCurrentRadio(radio.getMinRadio());
        assertEquals(radio.getMinRadio(), radio.getCurrentRadio());

        radio.prevRadio();
        assertEquals(radio.getMaxRadio(), radio.getCurrentRadio());
    }
}



