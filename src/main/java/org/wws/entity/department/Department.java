package org.wws.entity.department;

import org.wws.entity.employee.Employee;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by weiweisu on 3/18/14.
 */
@Entity
@Table(name="DEPARTMENT")
public class Department {
    @Id
    @Column(name = "department_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<Employee> employees;

    @Column(name="departmentType")
    private String departmentType;


//        BABYCARE("Babycare Department"), FOODRECIPE("Food Recipe Department"),
//        BABYFASHION("Baby Fashion"), ECOSYS("Eco System");


    public Department() {}

    public Department(String departmentType) {
        this.departmentType=departmentType;

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public String getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(String departmentType) {
        this.departmentType = departmentType;
    }
}
