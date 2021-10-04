package HomeTest6;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.util;

import java.util.function.IntConsumer;
@Log4j
public class HomeTest6_2 {
    util task = new util();
    @Test(priority = 1)
    public void numberSquare() {
        BasicConfigurator.configure();
        IntConsumer consumer=a->log.info(a*a);
        consumer.accept(5);
    }
}
