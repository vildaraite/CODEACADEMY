package lt.code.academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleService {
    private static final Logger LOG = LogManager.getLogger(SimpleService.class);
    public void division(int number){
        try{
            int result = 100 / number;
            System.out.println(result);
        }catch (ArithmeticException e) {
            LOG.error("Nepavyko padalinti ", e);
        }
    }
}
