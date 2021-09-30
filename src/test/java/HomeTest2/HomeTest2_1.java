package HomeTest2;

import lombok.extern.log4j.Log4j;
import org.HomeTask2.Product;
import org.HomeTask2.ProductRepository;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.util;
import java.util.List;
import java.util.function.Predicate;

@Log4j
public class HomeTest2_1 {
util task=new util();
    @Test(priority=1)
    public void checkProductIsGreaterThan1000() {
        BasicConfigurator.configure();
        List<Product> predicate= ProductRepository.filterProduct(task.createProductList(),product -> product.getPrice()>1000);
      log.info(predicate);

    }
}