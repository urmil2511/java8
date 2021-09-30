package HomeTest4;

import lombok.extern.log4j.Log4j;
import org.HomeTask2.Product;
import org.HomeTask2.ProductRepository;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.util;
import java.util.List;

@Log4j
public class HomeTest4_2 {
    util task=new util();
    @Test(priority=1)
    public void updateGrade() {
        BasicConfigurator.configure();
        List<Product> list= ProductRepository.filterProduct(task.createProductList(), product -> product.getPrice()>1000);
       log.info(task.updateGradeOfProduct(list, p->p.setGrade("Premium")));

    }
}
