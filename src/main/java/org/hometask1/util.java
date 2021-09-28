package org.hometask1;

import lombok.extern.log4j.Log4j;


import java.util.*;
@Log4j
public class util implements Palindrome,StringRotations{

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


}