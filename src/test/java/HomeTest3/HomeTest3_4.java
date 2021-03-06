package HomeTest3;

import lombok.extern.log4j.Log4j;
import org.HomeTask8.Product;
import org.HomeTask2.ProductRepository;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.util;

import java.util.List;

@Log4j
public class HomeTest3_4 {

    util task=new util();
    @Test(priority=1)
    public void productsPriceGreaterThan1000AndElectronics() {
        BasicConfigurator.configure();
        List<Product> predicate= ProductRepository.filterProduct(task.createProductList(), product -> product.getPrice()>1000 && product.getCategory().equals("electronics"));
        int fun=task.sum((List<Product>) predicate, x-> x.getPrice());
        log.info(fun);
    }
}
