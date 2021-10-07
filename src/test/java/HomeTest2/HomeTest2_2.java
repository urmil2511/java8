package HomeTest2;

import lombok.extern.log4j.Log4j;
import org.HomeTask8.Product;
import org.HomeTask2.ProductRepository;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.util;

import java.util.List;

@Log4j
public class HomeTest2_2 {
    util task=new util();
    @Test(priority=1)
    public void checkproductCategory() {
        BasicConfigurator.configure();
        List<Product> predicate= ProductRepository.filterProduct(task.createProductList(), product -> product.getCategory().equals("electronics"));
        log.info(predicate);
    }
}
