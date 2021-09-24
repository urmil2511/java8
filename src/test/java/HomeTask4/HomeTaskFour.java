package HomeTask4;

import HomeTask4.Product;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class HomeTaskFour {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Keyboard", 90, "electronics", "b"));
        list.add(new Product("Mouse", 500, "electronics", "b"));
        list.add(new Product("laptop", 25500, "electronics", "a"));
        list.add(new Product("car", 500000, "automobile", "a"));
        list.add(new Product("mobile", 2500, "electronics", "c"));
        list.add(new Product("bike", 53000, "automobile", "b"));
        System.out.println("Task 1");
        printToMedium(new Product("laptop", 25500, "electronics", "a"), "file");
        System.out.println("Task 2");
        list.stream().filter(prd -> prd.price > 1000).collect(Collectors.toList()).stream().
                map(prd -> {
                    prd.grade = "Premium";
                    return prd;
                }).forEach(p -> System.out.println(p));
        System.out.println("Task 3");
        list.stream().filter(p -> p.price > 3000).collect(Collectors.toList()).stream().map(product -> {
            product.name = "*" + product.name;
            return product;
        }).forEach(p -> System.out.println(p));
        System.out.println("Task 4");
        list.stream().filter(p -> p.grade.equals("Premium") && p.getName().startsWith("*")).collect(Collectors.toList()).forEach(p -> System.out.println(p));
        System.out.println("Supplier:Task 1");
        System.out.println(randomProduct(Product::new));
        System.out.println("Supplier:Task 2");
        System.out.println(getOtp(9).get());
    }

    public static void printToMedium(Product product, String medium) {
        Consumer<Product> productConsumer = s -> System.out.println(s);
        Consumer<Product> productConsumer1 = s -> {
            FileWriter writer = null;
            try {
                writer = new FileWriter("C:\\Users\\Urmil_Gajera\\IdeaProjects\\Java8Program\\src\\test\\java\\HomeTask4\\file.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.write(s.toString());
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        if (medium.equalsIgnoreCase("file")) {
            productConsumer1.accept(product);
        } else {
            productConsumer.accept(product);
        }

    }

    public static Product randomProduct(Supplier<Product> s) {
        Product product = s.get();
        product.setName("AC");
        product.setCategory("electronics");
        product.setPrice(20000);
        product.setGrade("a");

        return product;
    }

    public static Supplier<String> getOtp(int otplength) {
        return () -> {
            StringBuilder otp = new StringBuilder();
            Random random = new Random();
            for (int i = 0; i < otplength; i++) {
                int randomNumber = random.nextInt(9);
                otp.append(randomNumber);
            }
            return otp.toString();
        };
    }
}