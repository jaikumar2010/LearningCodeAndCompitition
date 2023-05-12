package com.designpattern.creational.factory.abstractfactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        testAbstractFactory();
    }
    public static void testAbstractFactory(){
        Student student = (Student) UserFactory
                .getUser(new StudentFactory("jai","81023","New Delhi 110001"));
        System.out.println("Name: "+student.getName());
        System.out.println("Address: "+student.getAddress());

        Instructor instructor = (Instructor) UserFactory
                .getUser(new InstructorFactory("Gagan","7891","Jharkhand"));
        System.out.println("Instructor Name: "+instructor.getName());
        System.out.println("Instructor Address: "+instructor.getAddress());



    }
}
