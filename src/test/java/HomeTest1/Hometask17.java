package HomeTest1;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
@Log4j
public class Hometask17 {

    @Test(priority=1)
    public void checkWithoutLambda() {
        BasicConfigurator.configure();
        TreeSet<Integer> set = new java.util.TreeSet<>();
        TreeSet<Integer> reverse = new TreeSet<>();
        set.addAll(Arrays.asList(121, 234, 43, 23, 567, 531));
        reverse = (TreeSet<Integer>) set.descendingSet();
        log.info("Without Lambda Expression");
        log.info(reverse);
    }
    @Test(priority = 2)
    public void checkWithLambda()
    {
        log.info("With Lambda Expression");
        TreeSet<Integer> set1=new java.util.TreeSet<>((o1,o2)->(o1>o2) ? -1 : (o1 < o2) ? 1 : 0);
        set1.addAll(Arrays.asList(121,234,43,23,567,531));
        log.info(set1);
    }
}
