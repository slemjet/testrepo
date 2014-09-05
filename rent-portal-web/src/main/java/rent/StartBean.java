package rent;

import rent.beans.HelloBeanLocal;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.logging.Logger;

@ManagedBean(name = "startBean")
@SessionScoped
public class StartBean {
    private final static Logger LOG = Logger.getLogger("StartBean");

    @EJB(name = "helloEJB")
    private HelloBeanLocal helloBeanLocal;

    public String getStart() {
        LOG.info("" + helloBeanLocal);
        return helloBeanLocal.sayHello() + helloBeanLocal.getSomeBook();
    }
}
