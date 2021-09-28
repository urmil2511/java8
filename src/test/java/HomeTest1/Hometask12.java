package HomeTest1;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.hometask1.LargestNumber;
import org.hometask1.SecondLargest;
import org.testng.annotations.Test;


@Log4j
public class Hometask12 {
    LargestNumber largestNumber = new LargestNumber();

    @Test(priority=1)
    public void checkWithoutLambda()
    {
        int[] arr = {5, 25, 3, 65, 4, 49};
        BasicConfigurator.configure();
        log.info("Second highest number without Lambda Expression: " + largestNumber.large(arr, arr.length));

    }

    @Test(priority=2)
    public void checkWithLambda() {
        int[] arr = {5, 25, 3, 65, 4, 49};
        SecondLargest s2 = (a, n1) -> largestNumber.large(a, n1);
        log.info("Second Highest Number With Lambda Expression: " + s2.large(arr, arr.length));

    }


}
