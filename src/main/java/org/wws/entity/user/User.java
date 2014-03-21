package org.wws.entity.user;

import org.wws.entity.role.Role;

import javax.persistence.*;

/**
 * Created by weiweisu on 3/20/14.
 */
@Entity
@Table(name="USERS")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column(name="userName")
    private String userName;
    @Column(name="password")
    private String password;

    @ManyToOne(cascade = CascadeType.ALL)
    private Role role;

    public User(){}

    public User(String userName, String password, Role role) {
        this.userName=userName;
        this.password=password;
        this.role=role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
