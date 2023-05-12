package com.designpattern.creational.factory.abstractfactory;

public class StudentFactory implements UserAbstractFactory{
    private String name;
    private String contact;
    private String address;

    public StudentFactory(String name, String contact, String address) {
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    @Override
    public User createUser() {
        return new Student(name,contact,address);
    }
}
