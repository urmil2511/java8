package HomeTest1;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.hometask1.util;
import org.testng.annotations.Test;
import java.util.*;

@Log4j
public class Hometask19 {
    util task=new util();

    @Test(priority=1)
    public void checkWithoutLambda() {
        BasicConfigurator.configure();
        Map<String, Integer> map = task.createmap();
        List<Map.Entry<String,Integer>> list=task.mapToList(map);
        log.info("Without Lambda expressions");
        log.info(list);
    }
    @Test(priority = 2)
    public void checkWithLambda()
    {
        log.info("With Lambda expressions");
        Map<String, Integer> map = task.createmap();
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(entrySet);
        Collections.sort(list,(o1,o2)->o2.getValue().compareTo(o1.getValue()));
        log.info(list);


    }
}