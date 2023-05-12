package com.designpattern.creational.factory.abstractfactory;

public class Admin extends User{
    private String name;
    private String contact;
    private String address;

    public Admin(String name, String contact, String address) {
        this.name = name;
        this.contact = contact;
        this.address = address;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getContact() {
        return contact;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
