package org.example;

//Creating contact class with all required elements
public class Contact {
    private String name;
    private String phoneNumber;
    //constructor
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
