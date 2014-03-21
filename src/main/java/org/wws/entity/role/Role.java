package org.wws.entity.role;

import javax.persistence.*;

/**
 * Created by weiweisu on 3/18/14.
 */
@Entity
@Table(name="ROLE")
public class Role {

    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name="roleType")
    private String roleType;

    public Role() {}

    public Role(String roleType) {
        this.roleType=roleType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    //        SectionAdmin("Section Admin"),
//        HealthcareProvider("Healthcare Provider"),
//        Sponser("Sponser"),
//        EducationProvider("EducationProvider"),
//        SystemAdmin("System Admin");


}
