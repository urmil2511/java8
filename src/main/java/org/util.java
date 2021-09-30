package org;

import lombok.extern.log4j.Log4j;
import org.HomeTask2.Product;
import org.HomeTask2.Response;
import org.hometask1.Employee;
import org.hometask1.Palindrome;
import org.hometask1.StringRotations;


import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Log4j
public class util implements Palindrome, StringRotations {

    public String perform(String s)
    {
        String temp="";
        int size=s.length();
        for(int i=size-1;i>=0;i--)
        {
            temp=temp+s.charAt(i);
        }
        if(s.equals(temp))
        {
            return "String is Palindrome";
        }
        else
        {
            return "String is not Palindrome";
        }
    }
    public String rotate(String str1,String str2)
    {
        String  str=str1+str1;
        if(str1.length()==str2.length() && str.indexOf(str2)!=-1) {
            return "Second string is a rotation of first string";
        }
        return "Second string is not a rotation of first string";
    }
    public List<Employee> createList()
    {
        Employee e3=new Employee(1,"aman","john");
        List<Employee> e=new ArrayList<Employee>();
        e.add(e3);
        e.add(new Employee(2,"roy","patel"));
        e.add(new Employee(3,"root","joe"));
        e.add(new Employee(4,"kohli","virat"));
       return e;
    }
    public Set<Employee> createSet()
    {
        Employee e1=new Employee(1,"aman","john");
        Employee e2=new Employee(2,"roy","patel");
        Employee e3=new Employee(3,"root","joe");
        Employee e4=new Employee(4,"kohli","virat");
        TreeSet<Employee> e=new TreeSet<Employee>();
        e.add(e1);
        e.add(e2);
        e.add(e3);
        e.add(e4);
        return e;
    }
    public Map<String,Integer> createmap()
    {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        map.put("Anshu", 3);
        map.put("Rajiv", 4);
        map.put("Chotu", 2);
        map.put("Golu", 5);
        map.put("Sita", 1);
        return map;
    }

    public List<Map.Entry<String, Integer>> mapToList(Map<String, Integer> map)
    {
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
        {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
    });
    return list;
   }
   public Map<Employee, String> createMapWithEmployee()
   {
       TreeMap<Employee, String> tm = new TreeMap<Employee, String>();
       tm.put(new Employee(1, "aman", "john"), "Aman");
       tm.put(new Employee(2, "roy", "patel"), "Roy");
       tm.put(new Employee(3, "root", "joe"), "Root");
       tm.put(new Employee(4, "kohli", "virat"), "Kohli");
       return tm;
   }
   public List<Product> createProductList()
   {
       List<Product> list=new ArrayList<>();
       list.add(new Product("Keyboard",90,"electronics","b"));
       list.add(new Product("Mouse",500,"electronics","b"));
       list.add(new Product("laptop",25500,"electronics","a"));
       list.add(new Product("car",25000,"automobile","a"));
       list.add(new Product("mobile",5500,"electronics","c"));
       list.add(new Product("bike",25300,"automobile","b"));
       return list;
   }
   public List<Response> createResponseList()
   {
       List<Response> list1=new ArrayList<>();
       list1.add(new Response("abc",400,"JSON"));
       list1.add(new Response("xyz",200,"JSON"));
       list1.add(new Response("kyc",400,"Text"));
       list1.add(new Response("net",201,"Text"));
       list1.add(new Response("rate",400,"JSON"));
       list1.add(new Response("pqr",400,"JSON"));
       return list1;
   }
   public int sum(List<Product> list, Function<Product,Integer> function)
   {
       int total=0;
       for(Product p:list)
       {
          total+= function.apply(p);
       }
       return total;
   }
    public static void printToMedium(org.HomeTask4.Product product, String medium) {
        Consumer<org.HomeTask4.Product> productConsumer = s -> System.out.println(s);
        Consumer<org.HomeTask4.Product> productConsumer1 = s -> {
            FileWriter writer = null;
            try {
                writer = new FileWriter("C:\\Users\\Urmil_Gajera\\IdeaProjects\\Java8Program\\src\\main\\java\\org\\HomeTask4\\file.txt");
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
    public List<Product> updateGradeOfProduct(List<Product> product,Consumer<Product> consumer)
    {

        for(Product p:product) {
            consumer.accept(p);
        }
        return product;
    }
    public List<Product> updateNameOfProduct(List<Product> product,Consumer<Product> consumer)
    {
        for(Product p:product) {
            consumer.accept(p);
        }
        return product;
    }

    public Product randomProduct(Supplier<Product> s) {
        Product product = s.get();
        /*product.setName("AC");
        product.setCategory("electronics");
        product.setPrice(20000);
        product.setGrade("a");*/

        return product;
    }

    public  Supplier<String> getOtp(int otplength) {
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