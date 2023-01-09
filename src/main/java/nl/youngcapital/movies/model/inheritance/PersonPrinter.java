package nl.youngcapital.movies.model.inheritance;

public class PersonPrinter {

    public static void printNameOfPersons(Person[] people) {

        for (Person person : people) {
            System.out.println(person.getName());
        }

    }
}
