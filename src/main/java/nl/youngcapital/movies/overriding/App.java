package nl.youngcapital.movies.overriding;

public class App {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();

        Animal b = new Bear();
        b.sound();

        Animal c = new Cow();
        c.sound();

    }
}
