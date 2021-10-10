package HomeTest9;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.util;

import java.time.LocalDate;
import java.util.function.Predicate;

@Log4j
public class HomeTest9_1 {

@Test
    public void givenDateIsYesterday() {
        BasicConfigurator.configure();

        Predicate<LocalDate> predicate= date-> {
            LocalDate todayDate=LocalDate.now();
           LocalDate previousDate= todayDate.minusDays(1);
            return previousDate.equals(date);
        };
        log.info(predicate.test(LocalDate.of(2021,10,9)));
    }
}
