package nl.youngcapital.movies.interfaces;

public interface Television {

    void on();
    void off();
    public abstract int setChannel(int newChannel);

    boolean isOn();
}
