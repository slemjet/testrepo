package rent.beans;

import rent.model.Book;
import rent.services.BookService;

import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;

/**
 * Created by Jet on 14.06.14.
 */
@Stateful(name = "helloEJB")
@SessionScoped()
public class HelloBean implements Serializable, HelloBeanLocal {

    @Inject
    private BookService bookService;

    public HelloBean() {
    }

    @Override
    public String sayHello() {
        return "Hello from EJB";
    }

    @Override
    public Book getSomeBook() {
        return bookService.createBook("CrazyBook", 12.4f, "Some awesome shit");
    }
}
