package nl.youngcapital.movies.scoping;

import nl.youngcapital.movies.model.Movie;

public class App {
    // scoping
    private String name;

    public void foo() {
        String label = "Nice";

        System.out.println(name);
        System.out.println(label);

        {
            int age = 41;

            age = age + 1;
            Movie m = new Movie("Poedel");
            age = age + 2;
        }
        {
//            age = age +1; // fout
            Movie b = new Movie("Alive and Kicking");
        }
    }

    public void bar() {
//        System.out.println(label); // fout
    }

}
