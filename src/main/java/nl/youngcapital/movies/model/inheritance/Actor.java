package nl.youngcapital.movies.model.inheritance;

public class Actor extends Person {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
