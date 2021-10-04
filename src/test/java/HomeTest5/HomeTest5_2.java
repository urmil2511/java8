package HomeTest5;

import lombok.extern.log4j.Log4j;
import org.HomeTask2.Product;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.util;


@Log4j
public class HomeTest5_2 {
    util task = new util();

    @Test(priority = 1)
    public void calculateCostOfCart() {
        BasicConfigurator.configure();
        Integer sum=task.costOfProduct();

        log.info(sum);
    }
}
