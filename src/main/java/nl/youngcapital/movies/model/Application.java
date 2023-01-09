package nl.youngcapital.movies.model;

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

    }
}
