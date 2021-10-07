package HomeTest3;

import lombok.extern.log4j.Log4j;
import org.HomeTask8.Product;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.util;

import java.util.List;

@Log4j
public class HomeTest3_1 {

    util task=new util();
    @Test(priority=1)
    public void calculateCostOfProducts() {
        BasicConfigurator.configure();
        List<Product> list=task.createProductList();
        int fun=task.sum(list, x-> x.getPrice());
        log.info(fun);

    }
}
