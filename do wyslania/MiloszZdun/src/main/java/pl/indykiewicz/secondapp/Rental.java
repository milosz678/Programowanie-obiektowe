package pl.indykiewicz.secondapp;

import java.util.ArrayList;

public class Rental {

    ArrayList<Person> members = new ArrayList<>();
    ArrayList<Person> debtors = new ArrayList<>();
    ArrayList<Item> stock = new ArrayList<>();
    int maxRentTime = 60; // days dicks
    int feePerDay  = 20; // Colombian pesos :>

    public void checkMembersEligibility(){
        for(Person member : members){
            for(Item item : member.inventory){
                member.isEligible = maxRentTime >= item.timeLended;
            }
        }
    }

    public void borrowItem(Item item, int memberNumber){
        Person target = members.get(memberNumber);

        if(target == null){
            throw new IllegalArgumentException("There is no member of such number.");
        }else if(target.isEligible){
            target.inventory.add(item);
        }else{
            throw new IllegalStateException("Member is not eligible for borrow!");
        }
    }

    public void addMember(int age, String name, String surname, String address){
        members.add(new Person(age, name, surname, address));
    }

    public void printMember(int n){
        if(n > members.size() -1 || n < 0){
            throw new IllegalArgumentException("Number was higher than list size or smaller than zero");
        }else{
            members.get(n).toString();
        }
    }


}
