package org.HomeTask7;
interface emp
{
    public Employee get(String name,String account, int salary);
}
public class HomeTaskSeven {
    public static void main(String[] args)
    {
      emp e=Employee::new;
     Employee data= e.get("Roy","Saving",25000);
        System.out.println(data.name +" " + data.account+" " + data.salary);
    }

}
