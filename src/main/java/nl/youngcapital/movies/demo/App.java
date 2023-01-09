package nl.youngcapital.movies.demo;

import nl.youngcapital.movies.model.Person;

public class App {

    public static void main(String[] args) {
        Person p = new Person("Raymond");

        System.out.println(p.getName());
        p.setName(""); // will fails since I tweaked the setter to ignore blank strings

        System.out.println(p.getName());

        p.setName("Francien");
        System.out.println(p.getName());


    }
}
