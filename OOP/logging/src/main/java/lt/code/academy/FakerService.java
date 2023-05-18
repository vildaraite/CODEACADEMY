package lt.code.academy;

import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class FakerService {
    private static final Logger LOG = (Logger) LogManager.getLogger(FakerService.class);
    public void printAnimals() {
        Faker faker = new Faker();

        for(int i = 0; i < 100; i++) {
            LOG.info("Gyvuno vardas: {}", faker.animal().name());
            System.out.println(faker.animal().name());
        }
    }
}
