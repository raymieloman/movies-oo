package nl.youngcapital.movies.demo;

import nl.youngcapital.movies.model.Person;

public class App {

    public static void main(String[] args) {
        Person p = new Person("Raymond");

        System.out.println(p.getName());
        p.setName("");

        System.out.println(p.getName());

        p.setName("Francien");
        System.out.println(p.getName());


    }
}
