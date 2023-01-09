package nl.youngcapital.movies.interfaces;

public class Philips implements Television {

    private boolean on = false;
    private int currentChannel = 0;

    public void on() {
        this.on = true;
    }

    public void off() {
        this.on = false;
    }

    public int setChannel(int newChannel) {
        this.currentChannel = newChannel;

        return this.currentChannel;
    }

    public boolean isOn() {
        return this.on;
    }
}
