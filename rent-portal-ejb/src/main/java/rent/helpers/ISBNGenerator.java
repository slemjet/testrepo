package rent.helpers;

import rent.helpers.logging.Loggable;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by Jet on 14.06.14.
 */
@ThirteenDigits
public class ISBNGenerator implements NumberGenerator {

    @Inject
    private Logger logger;

    @Loggable
    public String generateNumber() {
        String isbn = "13-84356-" + Math.abs(new Random().nextInt());
        logger.info("Generated ISBN: " + isbn);
        return isbn;
    }
}
