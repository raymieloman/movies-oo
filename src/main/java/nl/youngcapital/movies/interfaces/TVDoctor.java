package nl.youngcapital.movies.interfaces;

public class TVDoctor {

    public static void switchTvsOn(Television[] tvs) {
        for (Television tv : tvs) {
            tv.on();
            System.out.println(tv.isOn());
        }

    }
}
