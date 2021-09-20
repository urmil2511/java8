package HomeTask1;

import java.util.Comparator;

public class NameSorter implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        return e1.getFirstName().compareTo(e2.getFirstName());

    }
}
