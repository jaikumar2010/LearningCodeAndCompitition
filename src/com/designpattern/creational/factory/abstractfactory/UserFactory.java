package com.designpattern.creational.factory.abstractfactory;

public class UserFactory {
    public static User getUser(UserAbstractFactory userAbstractFactory){
        return userAbstractFactory.createUser();
    }
}
