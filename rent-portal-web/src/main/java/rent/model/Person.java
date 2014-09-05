package rent.model;


import rent.model.annotations.SSNValid;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Jet on 15.06.14.
 */
@SessionScoped
@ManagedBean
public class Person {
    @NotNull
    private String firstname;
    @NotNull
    private String lastname;
    @NotNull
    @Size(min = 3, max = 20, message = "<a href=\"#\" class=\"pointer\" data-id=\"login\">User login mast be between 3 and 20 symbols</a>")
    private String login;
    @NotNull
    @Size(min = 5, max = 20)
    private String password;
    @SSNValid
    private String ssn;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
