package HomeTest6;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.util;

import java.util.Random;
import java.util.function.IntSupplier;

@Log4j
public class HomeTest6_3 {
    util task = new util();
    @Test(priority = 1)
    public void createRandomNumber() {
        BasicConfigurator.configure();
        IntSupplier random=()->new Random().nextInt(5000);
        log.info(random.getAsInt());
    }
}
