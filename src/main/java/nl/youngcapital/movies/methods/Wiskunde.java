package nl.youngcapital.movies.methods;

public class Wiskunde {


    // this is a 'method'
    public static int max(int first, int ... moreNumbers) {

        int result = first;
        for (int element : moreNumbers) {
            if(element > result) {
                result = element;
            }
        }

        return result;
    }
}
