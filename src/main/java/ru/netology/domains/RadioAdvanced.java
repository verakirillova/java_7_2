package ru.netology.domains;

public class RadioAdvanced {


    private int maxRadio = 9;
    private int minRadio = 0;
    private int currentRadio = 0;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume = 0;

    public int getMaxRadio() {
        return maxRadio;
    }

    public void setMaxRadio(int maxRadio) {
        this.maxRadio = maxRadio;
    }

    public int getMinRadio() {
        return minRadio;
    }

    public void setMinRadio(int minRadio) {
        this.minRadio = minRadio;
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio > this.getMaxRadio()) {
            this.currentRadio = this.getMinRadio();
            return;
        }
        if (currentRadio < this.getMinRadio()) {
            this.currentRadio = this.getMaxRadio();
            return;
        }
        this.currentRadio = currentRadio;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > this.getMaxVolume()) {
            return;
        }
        if (currentVolume < this.getMinVolume()) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void plusVolume() {
        this.setCurrentVolume(this.getCurrentVolume() + 1);

    }

    public void minusVolume() {
        this.setCurrentVolume(this.getCurrentVolume() - 1);
    }

    public void nextRadio() {
        this.setCurrentRadio(this.getCurrentRadio() + 1);

    }

    public void prevRadio() {
        this.setCurrentRadio(this.getCurrentRadio() - 1);
    }

}
