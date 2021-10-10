package HomeTest9;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.util;
import java.time.LocalDate;
import java.util.function.Supplier;

@Log4j
public class HomeTest9_2 {
        util task = new util();
        @Test(priority = 1)
        public void dateForNextThursday() {
            BasicConfigurator.configure();
            Supplier<LocalDate> supplier=()->{
                LocalDate currentDate=LocalDate.now();
               int add=7-currentDate.getDayOfWeek().getValue()+4;
                return currentDate.plusDays(add);
            };
         log.info(supplier.get());
        }
}
