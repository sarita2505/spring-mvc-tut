package com.spring.model;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class User {
    @Size(min=7, max=30
            //,message = "username should be with in {min}to{max}"
    )
    private String username;
    private Integer id;
    private ArrayList<String> strings;
    private Address address;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<String> getStrings() {
        return strings;
    }

    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
