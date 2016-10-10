package blair.carina.model;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Profile {
    @Id
    @GeneratedValue
    String firstname;
    String lastname;
    String password;
    String emailAddress;
    //UUID userID;

    public Profile(String firstname, String lastname, String password, String emailAddress){
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.emailAddress = emailAddress;
    }

    public void setFirstname(String f){
        this.firstname = f;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

}
