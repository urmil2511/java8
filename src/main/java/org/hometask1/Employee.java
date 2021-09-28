package org.hometask1;

import lombok.Data;
@Data
public  class Employee implements Comparable<Employee> {
    private int id;
    private String firstName = null;
    private String lastName = null;

    public Employee(int id, String fName, String lName) {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
    }


    @Override
    public int compareTo(Employee o) {
        return 1;
    }
}
