package com.beginner.micromaster.contactlist;

import java.io.Serializable;

public class Contact implements Serializable {

    private String name;
    private String lastName;
    private String email;
    private int phoneNumber;

    public Contact(String name, String lastName, String email, int phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "name:" + name + ", " +
            "lastName:" + lastName + ", " +
            "email:" + email + ", " +
            "phoneNumber:" + phoneNumber;

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
