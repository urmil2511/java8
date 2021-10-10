package HomeTest9;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.function.Supplier;
@Log4j
public class HomeTest9_3 {

    @Test(priority = 1)
    public void currentTimeInEST() {
        BasicConfigurator.configure();
        Supplier<String> supplier=()->{
            ZoneId zone=ZoneId.of( "America/New_York");
            ZonedDateTime zdt=ZonedDateTime.now(zone);
            return zdt.getHour()+":"+ zdt.getMinute()+":"+ zdt.getSecond();
        };
        log.info(supplier.get());
    }
}
