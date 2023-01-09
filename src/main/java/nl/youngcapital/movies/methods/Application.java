package nl.youngcapital.movies.methods;

public class Application {
    public static void main(String[] args) {

        int maximaleWaarde = Math.max(3,4); // demo invocation of method in class Math
        System.out.println(maximaleWaarde);

        int deMax = Wiskunde.max(3,4,18,34,55,89,144,233);
        System.out.println(deMax);
    }
}
