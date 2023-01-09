package nl.youngcapital.movies.overriding;

public class Bear extends Animal {

    @Override
    public void sound() {
        System.out.println("Bear making sound (BRULL) ");
    }
}
