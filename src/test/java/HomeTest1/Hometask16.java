package HomeTest1;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.hometask1.Employee;
import org.hometask1.NameSorter;
import org.hometask1.util;
import org.testng.annotations.Test;
import java.util.Collections;
import java.util.List;

@Log4j
public class Hometask16 {
    util task = new util();
    @Test(priority=1)
    public void checkWithoutLambda() {
        BasicConfigurator.configure();
        List<Employee> e = task.createList();
        Collections.sort(e, new NameSorter());
        log.info("Without Lambda Expression: ");
        log.info(e);
    }
    @Test(priority = 2)
    public void checkWithLambda()
    {
        log.info("With Lambda Expression: ");
        List<Employee> emp=task.createList();
        emp.sort((Employee e1,Employee e2)->e1.getFirstName().compareTo(e2.getFirstName()));
        log.info(emp);
    }
}
