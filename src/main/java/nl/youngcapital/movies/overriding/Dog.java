package nl.youngcapital.movies.overriding;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog making sound (Bark)");
    }
}
