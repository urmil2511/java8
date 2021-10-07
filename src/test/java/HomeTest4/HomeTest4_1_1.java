package HomeTest4;

import lombok.extern.log4j.Log4j;
import org.HomeTask8.Product;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.util;

@Log4j
public class HomeTest4_1_1 {
    util task=new util();
    @Test(priority=1)
    public void randomProduct() {
        BasicConfigurator.configure();
        log.info(task.randomProduct(()->new Product("ac",90,"electronics","b")));

    }
}
