package HomeTest1;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.hometask1.Palindrome;
import org.hometask1.util;
import org.testng.Assert;
import org.testng.annotations.Test;

@Log4j
public class Hometask11 {
    util task = new util();

        @Test(priority=1)
      public void checkPalindromeWithoutLambda()
      {
          BasicConfigurator.configure();
              log.info("Without Lambda Expression:");
              String result=task.perform("abcdcba");
          log.info(result);
          Assert.assertTrue(result.indexOf("not")==-1);

      }
        @Test(priority = 2)
        public void checkPalindromeWithLambda()
        {
            log.info("With Lambda Expression:");
            Palindrome pal=var-> task.perform(var);
            String result= pal.perform("abcdcba");
            log.info(result);
            Assert.assertTrue(result.indexOf("not")==-1);

        }

}
