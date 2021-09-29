package HomeTest1;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.hometask1.StringRotations;
import org.hometask1.util;
import org.testng.annotations.Test;

@Log4j
public class Hometask13 {
    util task = new util();
    @Test(priority=1)
    public void checkWithoutLambda() {
        BasicConfigurator.configure();

        log.info("Without Lambda Expression: " + task.rotate("test", "stte"));
    }
    @Test(priority = 2)
    public void checkWithLambda() {
        StringRotations r2 = (String str1, String str2) -> task.rotate(str1,str2);

        log.info("With Lambda Expression: " + r2.rotate("auto", "stte"));
    }

}
