package HomeTask5;

import HomeTask5.Product;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class HomeTaskFive {
    public static void main(String[] args) {
        Map<HomeTask5.Product,Integer> cart=new HashMap<>();
        List<Product> list = new ArrayList<>();
        list.add(new Product("Keyboard", 90, "electronics", "b"));
        list.add(new Product("Mouse", 500, "electronics", "b"));
        list.add(new Product("laptop", 25500, "electronics", "a"));
        list.add(new Product("car", 500000, "automobile", "a"));
        list.add(new Product("mobile", 2500, "electronics", "c"));
        list.add(new Product("bike", 53000, "automobile", "b"));
        System.out.println("Task 1");

        BiFunction<String,Integer,Product> newproduct=(name,price)->new Product(name,price,null,null);
        Product p=newproduct.apply("Headset",1500);
        System.out.println(p);

        BiFunction<HomeTask5.Product,Integer,Integer> costOfProduct=(product,quantity)->{
            int sum=product.price*quantity;
            cart.put(product,quantity);
                    return sum;
        };

        Function<List<Product>,Integer> addProduct=products -> products.stream().map(prod -> costOfProduct.apply(prod,new Random().nextInt(10)))
                .reduce(0,(a,b)->a+b);
    //costOfProduct.apply(new Product("Keyboard", 90, "electronics", "b"),3);
   // costOfProduct.apply(new Product("mobile", 2500, "electronics", "c"),2);
       int costofCart=addProduct.apply(list);
      System.out.println(costofCart);
        System.out.println(cart);


    }
}