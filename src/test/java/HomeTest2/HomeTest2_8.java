package HomeTest2;

import lombok.extern.log4j.Log4j;
import org.HomeTask2.ProductRepository;
import org.HomeTask8.Response;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.util;

import java.util.List;
@Log4j
public class HomeTest2_8 {
    util task=new util();
    @Test(priority=1)
    public void checkResponsestatusCodeIs400AndTypeJSON() {
        BasicConfigurator.configure();
        List<Response> predicate = ProductRepository.filterResponse(task.createResponseList(), response -> response.getStatusCode()==400 && response.getResponseType().equals("JSON"));
        log.info(predicate);
    }
}
