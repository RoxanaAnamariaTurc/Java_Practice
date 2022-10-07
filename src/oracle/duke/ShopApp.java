package oracle.duke;

import java.util.Arrays;
import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShopApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Duke Choice Shop!");

        System.out.println("Minimum price is : " + Clothing.MIN_PRICE);
        Customer c1 = new Customer("Pinky", 14);

        // c1.setSize("S");
        // int measurement = 3;
        // c1.setSize(measurement);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "S");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing[] items = { item1, item2, new Clothing("Green Scarf", 5.0, "S"),
                new Clothing("Blue T-Shirt", 10.5, "S") };
        // c1.setSize(3);

        c1.addItem(items);

        try {
            ItemsList list = new ItemsList(items);
            Routing routing = Routing.builder()
                    .get("/items", list).build();
            ServerConfiguration config = ServerConfiguration.builder().bindAddress(InetAddress.getLocalHost())
                    .port(8888).build();
            WebServer ws = WebServer.create(config, routing);
            ws.start();
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }

        // System.out.println(item1.description + "," + item1.price + "," + item1.size +
        // " ," + item2.description + ","
        // + item2.price + "," + item2.size);

        // total = (item1.price + (item2.price * 2));

        // tax = total * tax;
        // total = tax + total;
        double total = 0.0;
        System.out.println(
                "Welcome to the shop " + c1.getName() + " " + c1.getSize() + " " + c1.getTotalClothingCost());
        for (Clothing item : c1.getItems()) {
            // System.out.println("Items " + item.getDescription());
            System.out.println("Item " + item);

        }

        int average = 0;
        int count = 0;
        for (Clothing item : c1.getItems()) {
            if (item.getSize().equals("L")) {

                count++;
                average += item.getPrice();
            }
        }
        try {
            average = (count == 0) ? 0 : average / count;
            average = average / count;
            System.out.println("Average price " + average + " , Count " + count);
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by zero");
        }

        Arrays.sort(c1.getItems());
        for (Clothing item : c1.getItems()) {
            // System.out.println("Items " + item.getDescription());
            System.out.println("Item " + item);

        }

    }

}
