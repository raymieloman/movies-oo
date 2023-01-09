package nl.youngcapital.movies.model;

/* zonder public of iets anders is package private oftewel indezelfde folder */
public class Movie {

    // Encapsulation
    private String name;
    private int length;
    private int stars;

    /*
    Java heeft 8 primitives: the element of the periodic system
    gehele getallen
    - byte => 8 bits => -128 tot(via de 0) +127 (256 mogelijkheden = 2^8)
    - short => 16 bits < -32768 - 32767)
    - int => 32 bits geheel getal (-2miljard tot +2 miljard)
    - long => 64 bits geheel getal <

    - letters:
    - char 'a', 'b', 'z', 'q'

    - waar of niet waar ... boolean
    - true false

    - floating points
    -- float: 32 bits floating point number.... 1.2f, 2.3f
    -- double: 64 bits floating point number 1.2, 2.3     1000.3343434;
    // let op met floats in Java want ze zijn onderhevig aan (foutieve) afrondingen.
     */

    // new and constructor is a marriage
    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    // this is a 'method' and more specific: a 'setter'
    public void setLength(int length) {
        this.length = length;
    }

    // this is a 'method' and more specific: a 'getter'
    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        if (stars > 0 && stars <= 5) {
            this.stars = stars;
        }
    }
}
