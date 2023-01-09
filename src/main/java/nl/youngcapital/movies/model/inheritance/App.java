package nl.youngcapital.movies.model.inheritance;

public class App {

    public static void main(String[] args) {
        Actor morganFreeman = new Actor();
        morganFreeman.setName("Morgan Freeman"); // door inheritance verworven

        morganFreeman.setPrice(10000);
        System.out.println(morganFreeman.getPrice());

        // voorbeeld van wel of niet abstract zijn
//        Person piet = new Person();  // fout

        // wel
        Person clintEastwood = new Actor();

        Person raymond = new Runner();

        Object clint = new Actor();

        // aan de linkerkant van het = noemen we de definitie
        // aan de rechterkant van het = noemen we de constructie

        /*
        Tijdens het programmeren zie ik de API van de definitie
        Tijdens het draaien van het programma zie ik de API van de constructie (dus ook de definitie)
         */

        PersonPrinter.printNameOfPersons(new Person[]{morganFreeman, clintEastwood, raymond});
    }
}
