package HomeTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HomeTaskTwo {
    public static void main(String[] args) {
        List<Product> list=new ArrayList<>();
        list.add(new Product("Keyboard",90,"electronics","b"));
        list.add(new Product("Mouse",500,"electronics","b"));
        list.add(new Product("laptop",25500,"electronics","a"));
        list.add(new Product("car",25000,"automobile","a"));
        list.add(new Product("mobile",5500,"electronics","c"));
        list.add(new Product("bike",25300,"automobile","b"));
        List<Response> list1=new ArrayList<>();
        list1.add(new Response("abc",400,"JSON"));
        list1.add(new Response("xyz",200,"JSON"));
        list1.add(new Response("kyc",400,"Text"));
        list1.add(new Response("net",201,"Text"));
        list1.add(new Response("rate",400,"JSON"));
        list1.add(new Response("pqr",400,"JSON"));
        List<Product> result = ProductRepository.filterProduct(list,x->x.price>1000);
        List<Product> result1= ProductRepository.filterProduct(list,x->x.category.equals("electronics"));
        List<Product> result2=ProductRepository.filterProduct(list,x->x.category.equals("electronics") && x.price >100);
        List<Product> result3=ProductRepository.filterProduct(list,x->x.category.equals("electronics") || x.price >100);
        List<Product> result4=ProductRepository.filterProduct(list,x->x.category.equals("electronics") && x.price <100);

        List<Response> r1=ProductRepository.filterResponse(list1,x->x.statusCode==400);
        List<Response> r2=ProductRepository.filterResponse(list1,x->x.responseType.equals("JSON"));
        List<Response> r3=ProductRepository.filterResponse(list1,x->x.statusCode==400 && x.responseType.equals("JSON"));
        List<Response> r4=ProductRepository.filterResponse(list1,x->x.statusCode==400 || x.responseType.equals("JSON"));
        List<Response> r5=ProductRepository.filterResponse(list1,x->x.statusCode!=400 && x.responseType.equals("JSON"));


        System.out.println("Task 1:"+ result);
        System.out.println("Task 2:"+ result1);
        System.out.println("Task 3:"+ result2);
        System.out.println("Task 4:"+ result3);
        System.out.println("Task 5:"+ result4);
        System.out.println("Task 6:"+ r1);
        System.out.println("Task 7:"+ r2);
        System.out.println("Task 8:"+ r3);
        System.out.println("Task 9:"+ r4);
        System.out.println("Task 10:"+ r5);






    }
}
