package HomeTest9;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.util;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.function.Function;
import java.util.function.Supplier;
@Log4j
public class HomeTest9_4 {
    @Test
    public void ageCalculate() {
        BasicConfigurator.configure();
        Function<LocalDate,String> age=date->{
            LocalDate birthdate=LocalDate.of(1994,11,25);
            Period period=Period.between(birthdate,date);
            log.info(period.getYears());
            return String.valueOf(period);

        };
     log.info(age.apply(LocalDate.now()));

    }

}
