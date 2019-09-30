package jpa.entities;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username",nullable = false,length = 50)
    private String username;

    @Column(name = "password",nullable = false,length = 20)
    private String password;

    @Column(name = "ROLE_ID",nullable = false)
    @OneToMany(fetch = FetchType.LAZY)
    private Set<UserRoles> userRole_id;

    public User() {
    }

    public User(String username, String password, Set<UserRoles> userRole_id) {
        this.username = username;
        this.password = password;
        this.userRole_id = userRole_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<UserRoles> getUserRole_id() {
        return userRole_id;
    }

    public void setUserRole_id(Set<UserRoles> userRole_id) {
        this.userRole_id = userRole_id;
    }
}
