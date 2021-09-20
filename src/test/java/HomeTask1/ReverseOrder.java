package HomeTask1;

import java.util.*;

public class ReverseOrder {
    public static void main(String[] args) {
        Employee e3=new Employee(1,"aman","john");
        List<Employee> e=new ArrayList<Employee>();
               e.add(e3);
                e.add(new Employee(2,"roy","patel"));
               e.add(new Employee(3,"root","joe"));
               e.add(new Employee(4,"kohli","virat"));
        List<Integer> list= Arrays.asList(121,342,345,32,235,678,987);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
        Collections.sort(e,new NameSorter());
        System.out.println(e);
        System.out.println("With Lambda Expression: ");
       // Collections.sort(list,(o1,o2)->(o1>o2) ? -1 : (o1 < o2) ? 1 : 0);
        Collections.sort(list,(o1,o2)->o2-o1);
        System.out.println(list);
        e.sort((Employee e1,Employee e2)->e1.getLastName().compareTo(e2.getLastName()));
        System.out.println(e);


    }
}
