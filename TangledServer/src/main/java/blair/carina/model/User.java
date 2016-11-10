package blair.carina.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String email;
    private String password;

    private int accountStatus;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = {@JoinColumn(name="users_id")},
            inverseJoinColumns = {@JoinColumn(name="roles_id")}
    )

    private Set<Role> roles = new HashSet<>();


    public User(){}

    public User(String firstname, String lastName, String email, String password){
        this.firstName = firstname;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.accountStatus = 1;

    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

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

    public int isAccountStatus() {return accountStatus;}

    public void setAccountStatus(int accountStatus) {this.accountStatus = accountStatus;}
}
