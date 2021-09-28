package HomeTest1;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;

import java.util.*;

@Log4j
public class Hometask15 {

    @Test(priority=1)
    public void checkWithoutLambda() {
        BasicConfigurator.configure();
        List<Integer> list = Arrays.asList(121, 342, 345, 32, 235, 678, 987);
        log.info("Without Lambda Expression: ");
        list.sort(Comparator.reverseOrder());
        log.info(list);
    }
    @Test(priority = 2)
    public void checkWithLambda()
    {
        log.info("With Lambda Expression: ");
        List<Integer> list1 = Arrays.asList(121, 342, 345, 32, 235, 678, 987);
       // Collections.sort(list,(o1,o2)->(o1>o2) ? -1 : (o1 < o2) ? 1 : 0);
       // Collections.sort(list,(o1,o2)->o2-o1);
        list1.sort((o1,o2)->o2-o1);
        log.info( String.valueOf(list1));



    }
}
