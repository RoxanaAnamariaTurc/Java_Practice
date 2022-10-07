package oracle.duke;

public class Clothing implements Comparable<Clothing> {
    private String description;
    public static final double MIN_PRICE = 10.0;
    public static final double TAX_RATE = 0.2;
    private String size = "M";
    private double price;

    @Override
    public int compareTo(Clothing c) {
        return this.description.compareTo(c.description);
    }

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public void setPrice(double price) {

        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;

    }

    public double getPrice() {
        return price + (price * TAX_RATE);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return getDescription() + "," + getPrice() + ", " + getSize();
    }

}
