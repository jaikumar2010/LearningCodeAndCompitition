package com.designpattern.creational.factory.abstractfactory;

public class InstructorFactory implements UserAbstractFactory{
    private String name;
    private String contact;
    private String address;

    public InstructorFactory(String name, String contact, String address) {
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    @Override
    public User createUser() {
        return new Instructor(name,contact,address);
    }
}
