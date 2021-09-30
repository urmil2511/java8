package HomeTest1;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.hometask1.Employee;
import org.hometask1.NameSorter;
import org.util;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.TreeMap;

@Log4j
public class Hometask20 {
    util task=new util();
    @Test(priority=1)
    public void checkWithoutLambda() {
        BasicConfigurator.configure();
        Map<Employee,String> tm=new TreeMap<>(new NameSorter());
        tm.putAll(task.createMapWithEmployee());
        log.info("Without Lambda expressions");
        log.info(tm);
    }
    @Test(priority = 2)
    public void checkWithLambda()
    {
        log.info("With Lambda expressions");
        TreeMap<Employee,String> tm1 = new TreeMap<Employee, String>((Employee t1,Employee t2)->t1.getFirstName().compareTo(t2.getFirstName()));
       tm1.putAll(task.createMapWithEmployee());
        log.info(tm1);
    }
}
