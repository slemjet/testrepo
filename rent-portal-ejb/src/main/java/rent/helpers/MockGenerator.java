package rent.helpers;

import rent.helpers.logging.Loggable;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by Jet on 14.06.14.
 */
@Alternative
@ThirteenDigits
public class MockGenerator {
    @Inject
    private Logger logger;

    @Loggable
    public String generateNumber() {
        String mock = "MOCK-" + Math.abs(new Random().nextInt());
        logger.info("Generated Mock : " + mock);
        return mock;
    }
}
