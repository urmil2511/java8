package HomeTest7;

import lombok.extern.log4j.Log4j;
import org.HomeTask7.Employee;
import org.HomeTask7.emp;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.util;

@Log4j
public class HomeTest7_1 {
    util task = new util();
    @Test(priority = 1)
    public void getEmployeeObject() {
        BasicConfigurator.configure();
        {
            emp e= Employee::new;
            Employee data= e.get("Roy","Saving",25000);
           log.info(data.name +" " + data.account+" " + data.salary);
        }
    }
}
