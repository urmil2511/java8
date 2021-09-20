package HomeTask1;

public  class Employee implements Comparable<Employee> {
    private int id;
    private String firstName = null;
    private String lastName = null;

    public Employee(int id, String fName, String lName) {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String toString() {
        return "Employee : " + id + " - " + firstName + " - " + lastName + "\n";
    }


    public int compareTo(Employee o) {
        return 1;
    }
}
