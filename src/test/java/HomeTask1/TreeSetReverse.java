package HomeTask1;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetReverse {
    public static void main(String[] args) {
        TreeSet<Integer> set=new java.util.TreeSet<>();
        TreeSet<Integer> set1=new java.util.TreeSet<>((o1,o2)->(o1>o2) ? -1 : (o1 < o2) ? 1 : 0);
        TreeSet<Integer> reverse=new TreeSet<>();
        Employee e1=new Employee(1,"aman","john");
        Employee e2=new Employee(2,"roy","patel");
        Employee e3=new Employee(3,"root","joe");
        Employee e4=new Employee(4,"kohli","virat");
        TreeSet<Employee> e=new TreeSet<Employee>(new NameSorter());
        TreeSet<Employee> emp=new TreeSet<Employee>((Employee o1,Employee o2)-> o1.getLastName().compareTo(o2.getLastName()));
        e.add(e1);
        e.add(e2);
        e.add(e3);
        e.add(e4);
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        set.addAll(Arrays.asList(121,234,43,23,567,531));
        set1.addAll(Arrays.asList(121,234,43,23,567,531));
        reverse= (TreeSet<Integer>) set.descendingSet();
        System.out.println(reverse);
        System.out.println(e);

        System.out.println("With Lambda Expression");
        System.out.println(set1);
        System.out.println(emp);


    }
}
