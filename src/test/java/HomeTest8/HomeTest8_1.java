package HomeTest8;

import lombok.extern.log4j.Log4j;
import org.HomeTask8.Product;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.util;

import java.util.List;

@Log4j
public class HomeTest8_1 {
    util task = new util();
    @Test(priority = 1)
    public void getListOfProduct() {
        BasicConfigurator.configure();
       List<Product> list=task.createProductList();
        log.info(task.getListOfProductsGreaterThanThousand(list,1000));
    }
}
