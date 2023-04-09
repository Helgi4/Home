import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MyClassSixth3 {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("Book", "Black", 15.0),
                new Product("Pen", "Blue", 2.5),
                new Product("Phone", "White", 999.0)
        ));

        printProducts(products, "Blue", 5.0);
    }

    public static void printProducts(List<Product> products, String color, double minPrice) {
        System.out.println("All products:");
        products.stream()
                .forEach(System.out::println);

        System.out.println("Products with color " + color + ":");
        products.stream()
                .filter(p -> p.getColor().equals(color))
                .forEach(System.out::println);

        System.out.println("Products with price higher than " + minPrice + ":");
        products.stream()
                .filter(p -> p.getPrice() > minPrice)
                .forEach(System.out::println);
    }

    public static class Product {
        private String name;
        private String color;
        private double price;

        public Product(String name, String color, double price) {
            this.name = name;
            this.color = color;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

}
