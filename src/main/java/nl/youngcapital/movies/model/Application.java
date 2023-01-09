package nl.youngcapital.movies.model;

import nl.youngcapital.movies.labels.Constants;
import nl.youngcapital.movies.model.inheritance.Actor;

public class Application {

    // startmotor
    public static void main(String[] args) {

        // our first instance(object) of class Movie
        Movie film = new Movie("Kill Bill"); // constructor
        film.setLength(125);
        film.setStars(4);

        Movie film2 = new Movie("The Matrix");
        film2.setLength(340);
        film2.setStars(3);

        System.out.println(film.getName());
        System.out.println(film.getStars());

//        film.name = "The Green Mile"; // vout
        film.setName("The Green Mile");

        System.out.println(film.getName());

        // Print het aantal geinstantieerde movies
        System.out.println(Movie.movieCounter);

        System.out.println(Integer.MAX_VALUE);

        System.out.println(Constants.CUSTOMER_NAME);

        Actor a = new Actor();
        a.setPrice(100);
        double btw = a.getPrice() *  Constants.BTW / 100;
        double totalPrice = a.getPrice() + btw;

        System.out.println(totalPrice);

        final String name = "Raymond";
//        name = "Poedel";// vout

    }
}
