package blair.carina.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long systemID;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean accountStatus;

    @ManyToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER )
    @JoinTable(
            name = "users_roles",
            joinColumns = {@JoinColumn(name="system_id")},
            inverseJoinColumns = {@JoinColumn(name="role_id")}
    )

    private Set<Role> roles = new HashSet<>();


    public User(){}

    public User(String firstname, String lastName, String email, String password){
        this.firstName = firstname;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.accountStatus = true;

    }

    public Long getSystemID() {return systemID;}

    public void setSystemID(Long systemID) {this.systemID = systemID;}

    public void setFirstName(String f){
        this.firstName = f;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {return lastName;}

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public boolean isAccountStatus() {return accountStatus;}

    public void setAccountStatus(boolean accountStatus) {this.accountStatus = accountStatus;}
}
