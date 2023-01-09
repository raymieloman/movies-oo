package nl.youngcapital.movies.model.inheritance.overriding;

public class App {

    public static void main(String[] args) {
        Animal a = new Cow();
        a.sound();

        Animal b = new Bear();
        b.sound();

        Animal c = new Cow();
        c.sound();

        Animal d = new Dog();
        d.sound();

    }
}
