package HomeTask1;

import java.util.*;

public class MapReverse {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        TreeMap<Employee,String> tm = new TreeMap<Employee, String>(new NameSorter());
        TreeMap<Employee,String> tm1 = new TreeMap<Employee, String>((Employee t1,Employee t2)->t1.getFirstName().compareTo(t2.getFirstName()));
        tm.put(new Employee(1,"aman","john"),"Aman");
        tm.put(new Employee(2,"roy","patel"),"Roy");
        tm.put(new Employee(3,"root","joe"),"Root");
        tm.put(new Employee(4,"kohli","virat"),"Kohli");
        tm1.put(new Employee(1,"aman","john"),"Aman");
        tm1.put(new Employee(2,"roy","patel"),"Roy");
        tm1.put(new Employee(3,"root","joe"),"Root");
        tm1.put(new Employee(4,"kohli","virat"),"Kohli");
        map.put("Anshu", 3);
        map.put("Rajiv", 4);
        map.put("Chotu", 2);
        map.put("Golu", 5);
        map.put("Sita", 1);
        Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
        List<Map.Entry<String, Integer>> list=new ArrayList<>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        System.out.println(list);
        System.out.println(tm);
        System.out.println("With Lambda expressions");
        Collections.sort(list,(o1,o2)->o2.getValue().compareTo(o1.getValue()));
        System.out.println(list);
        System.out.println(tm1);

    }
}
