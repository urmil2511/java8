package HomeTest1;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.hometask1.Employee;
import org.hometask1.NameSorter;
import org.hometask1.util;
import org.testng.annotations.Test;
import java.util.Set;
import java.util.TreeSet;

@Log4j
public class Hometask18 {
    util task=new util();

    @Test(priority=1)
    public void checkWithoutLambda() {
        BasicConfigurator.configure();
        log.info("Without Lambda Expression");
        TreeSet<Employee> employees=new TreeSet<>(new NameSorter());
        employees.addAll(task.createSet());
        log.info(employees);
    }
    @Test(priority = 2)
    public void checkWithLambda()
    {
        log.info("With Lambda Expression");
        Set<Employee> employees=task.createSet();
        TreeSet<Employee> emp=new TreeSet<Employee>((Employee o1,Employee o2)-> o1.getFirstName().compareTo(o2.getFirstName()));
        emp.addAll(employees);
        log.info(emp);
    }
}
