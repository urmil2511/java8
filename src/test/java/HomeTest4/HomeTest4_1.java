package HomeTest4;

import lombok.extern.log4j.Log4j;
import org.HomeTask4.Product;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.util;

@Log4j
public class HomeTest4_1 {

    util task=new util();
    @Test(priority=1)
    public void writeConsumer() {
        BasicConfigurator.configure();
        task.printToMedium(new Product("laptop", 25500, "electronics", "b"), "file");

    }
}
