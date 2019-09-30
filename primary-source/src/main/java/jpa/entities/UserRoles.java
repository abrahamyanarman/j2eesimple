package jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "Role")
public class UserRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ROLE_TYPE")
    private String role_type;



    public UserRoles() {

    }

    public UserRoles(String role_type) {
        this.role_type = role_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole_type() {
        return role_type;
    }

    public void setRole_type(String role_type) {
        this.role_type = role_type;
    }
}
