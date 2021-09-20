package HomeTask4;

import HomeTask4.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HomeTaskFour {
    public static void main(String[] args) {

        List<Product> list=new ArrayList<>();
        list.add(new Product("Keyboard",90,"electronics","b"));
        list.add(new Product("Mouse",500,"electronics","b"));
        list.add(new Product("laptop",25500,"electronics","a"));
        list.add(new Product("car",500000,"automobile","a"));
        list.add(new Product("mobile",5500,"electronics","c"));
        list.add(new Product("bike",53000,"automobile","b"));

        Consumer<Product> print=s-> System.out.println(s);
        Print.printConsumer(list,print);
        //list.forEach(print);


        
    }
}
