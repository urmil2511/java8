package HomeTest5;

import lombok.extern.log4j.Log4j;
import org.HomeTask4.Product;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.util;

import java.util.function.BiFunction;
import java.util.function.Function;

@Log4j
public class HomeTest5_1 {
    util task = new util();

    @Test(priority = 1)
    public void createProductBiFunction() {
        BasicConfigurator.configure();
       BiFunction<String,Integer,Product> productFunction=(name, price)->new Product(name,price,null,null);
        Product p=productFunction.apply("HeadSet",2000);
        log.info(p);

    }
}
