package nl.youngcapital.movies.interfaces;

public class App {

    public static void main(String[] args) {
        Television tv1 = new Philips();
        Television tv2 = new Samsung();

        System.out.println(tv1.isOn());

        TVDoctor.switchTvsOn(new Television[]{tv1, tv2});

    }
}
