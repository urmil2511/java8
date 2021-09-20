package HomeTask3;

import HomeTask2.Product;
import HomeTask2.ProductRepository;
import HomeTask2.Response;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HomeTaskThree {
    public static void main(String[] args) {
        List<HomeTask2.Product> list=new ArrayList<>();
        list.add(new HomeTask2.Product("Keyboard",90,"electronics","b"));
        list.add(new HomeTask2.Product("Mouse",500,"electronics","b"));
        list.add(new HomeTask2.Product("laptop",25500,"electronics","a"));
        list.add(new HomeTask2.Product("car",500000,"automobile","a"));
        list.add(new HomeTask2.Product("mobile",5500,"electronics","c"));
        list.add(new HomeTask2.Product("bike",53000,"automobile","b"));

        int total=list.stream().mapToInt(Product::getPrice).sum();
        int t1=list.stream().filter(x->x.getPrice()>1000).mapToInt(Product::getPrice).sum();
        int t2=list.stream().filter(x->x.getCategory().equals("electronics")).mapToInt(Product::getPrice).sum();
        int t3=list.stream().filter(x->x.getCategory().equals("electronics") && x.getPrice()>1000).mapToInt(Product::getPrice).sum();

        System.out.println("Task 1: "+ total);
        System.out.println("Task 2: "+ t1);
        System.out.println("Task 3: "+ t2);
        System.out.println("Task 4: "+ t3);


    }
}
