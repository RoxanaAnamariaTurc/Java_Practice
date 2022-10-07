package oracle.duke;

public class Customer {

    private String name;
    private String size;
    private Clothing[] items;

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1:
                setSize("S");
                break;
            case 2:
                setSize("S");
                break;
            case 3:
                setSize("S");
                break;
            case 4:
                setSize("M");
                break;
            case 5:
                setSize("M");
                break;
            case 6:
                setSize("M");
                break;
            case 7:
                setSize("L");
                break;
            case 8:
                setSize("L");
            case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
                break;

        }
    }

    public void addItem(Clothing[] someItems) {
        items = someItems;
    }

    public Clothing[] getItems() {
        return items;
    }

    public double getTotalClothingCost() {
        double total = 0.0;
        for (Clothing item : items) {

            // if (c1.getSize().equals(item.getSize())) {
            total = total + item.getPrice();
            // System.out.println(item.getDescription() + item.getPrice() + item.getSize());
            // total = total + total * tax;
            // if (total > 15) {
            // break;
            // }

            // }

        }
        return total;
    }
}
