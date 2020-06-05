package pl.indykiewicz.secondapp;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Person {

    ArrayList<Item> inventory = new ArrayList<>();
    int age;
    Date joinDate;
    String name, surname, address;
    boolean isEligible;

    public Person(int age, String name, String surname, String address){
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.address = address;
        isEligible = true;
        joinDate = Date.from(Instant.now());
    }

    @Override
    public String toString(){
        return ("Member's name: " +  name + "\nMember's surname: " + surname + "\nMember's age: " + age +
                "\nMember's address: " + address + "\nMember's date of joining: " + joinDate.toString() +
                "\nIs user eligible for rental? " + isEligible);
    }
}
