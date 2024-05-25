package com.example.kitaapp.models;

import java.util.Date;
import java.util.List;

public class Child {
    private String childId;
    private String firstName;
    private String lastName;
    private String gender;
    private Date birthday;
    private Date careStart;
    private Date careEnd;
    private Address address;
    private List<Parent> parents;

    // Getters and Setters
    public String getChildId() {
        return childId;
    }

    public void setChildId(String childId) {
        this.childId = childId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCareStart() {
        return careStart;
    }

    public void setCareStart(Date careStart) {
        this.careStart = careStart;
    }

    public Date getCareEnd() {
        return careEnd;
    }

    public void setCareEnd(Date careEnd) {
        this.careEnd = careEnd;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }
}
