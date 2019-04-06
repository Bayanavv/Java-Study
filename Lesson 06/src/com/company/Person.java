package com.company;

public class Person {

    //private מוסתר
    //properties:
    private String firstName;
    private String lastName;
    private int age;

    //get age
    public int getAge() {
        return age;
    }
    //set age
    public void setAge(int age) {
        this.age = age;
    }

    //constructor:
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    //toString: String(fistsName + lastName)
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }


}
