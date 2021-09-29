package HomeTest1;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;

@Log4j
public class Hometask14 {

    @Test(priority=1)
    public void checkWithoutLambda() {
        BasicConfigurator.configure();
        Runnable obj = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    log.info("Without Lambda Expression:" + i);
                }
            }
        };

        Thread t = new Thread(obj);
        t.start();
    }
        @Test(priority = 2)
        public void checkWithLambda()
        {
         Thread t1=new Thread(()->{
            for(int i=0;i<5;i++)
            {
                log.info("With Lambda Expression:"+i);
            }});
    try{
        Thread.sleep(10);
    }
    catch(Exception e){
        log.warn(e);
        Thread.currentThread().interrupt();
    }
    t1.start();

    }
}

