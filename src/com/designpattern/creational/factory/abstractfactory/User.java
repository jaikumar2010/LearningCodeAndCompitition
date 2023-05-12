package com.designpattern.creational.factory.abstractfactory;

public abstract class User {
    public String name;
    public String contact;
    public String address;


    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String  toString() {
        return "User{" +
                "name='" + this.getName() + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
