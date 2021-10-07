package org.HomeTask7;

import lombok.Data;


public class Employee {
    public String name;
    public String account;
    public int salary;


   public Employee(String name, String account, int salary)
    {
        this.name=name;
        this.account=account;
        this.salary=salary;
    }
}
