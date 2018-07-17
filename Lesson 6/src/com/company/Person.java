package com.company;

public class Person {

    //properties:
    private String firstName;
    private String lastNamel;
    private int age;

    //constructor:

    public Person(String firstName, String lastNamel, int age) {
        this.firstName = firstName;
        this.lastNamel = lastNamel;
        this.age = age;
    }
    //comand + "N" than chuse toString
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastNamel='" + lastNamel + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
        else {
            System.out.println("iligle age");
        }
    }
}

