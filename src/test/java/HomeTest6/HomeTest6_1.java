package HomeTest6;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.util;


@Log4j
public class HomeTest6_1 {
    util task = new util();
    @Test(priority = 1)
    public void checkPrime() {
        BasicConfigurator.configure();
      boolean flag=task.checkPrimeNumber(7);
        if(flag)
        {
            log.info("Prime Number");
        }
        else
        {
           log.info("Number is not prime number");
        }
    }
}
