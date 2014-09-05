package rent.beans;

import rent.model.Person;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by Jet on 15.06.14.
 */
@SessionScoped
@ManagedBean
public class RegistrationBean {
    private static Logger LOG = Logger.getAnonymousLogger();

    @ManagedProperty(value = "#{person}")
    private Person person;

    public String submitData(){
        LOG.info("Submitted data " + person);
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("somewhere");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
