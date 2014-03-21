package org.wws.entity.user;

import javax.persistence.*;

/**
 * Created by weiweisu on 3/18/14.
 */
@Entity
@Table(name="ADDRESS")
public class Address {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "address_id")
    private long id;

    @Column(name="street")
    private String street;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="zipCode")
    private String zipCode;

    public Address () {}

    public Address(String street, String city, String state, String zipCode) {
        this.city=city;
        this.street=street;
        this.state=state;
        this.zipCode=zipCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
