package rent.services;

import rent.helpers.NumberGenerator;
import rent.helpers.ThirteenDigits;
import rent.helpers.logging.Loggable;
import rent.model.Book;

import javax.inject.Inject;
import java.io.Serializable;

/**
 * Created by Jet on 14.06.14.
 */
@Loggable
public class BookService implements Serializable{

    @Inject
    @ThirteenDigits
    private NumberGenerator numberGenerator;

    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setNumber(numberGenerator.generateNumber());
        return book;
    }
}
