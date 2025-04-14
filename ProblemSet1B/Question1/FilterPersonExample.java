package ProblemSet1B.Question1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FilterPersonExample {
    // No need to modify this class
    public static void main(String[] args) {
        Person p1 = new Person("A", 90, 'F', false);
        Person p2 = new Person("B", 60, 'M', true);
        Person p3 = new Person("C", 30, 'F', true);
        Person[] p = {p1, p2, p3};

        System.out.println( Filter.seniorFilter(p) );
        System.out.println( p1 ); // or p1.toString()
    }
}

class Filter {

    //////////////////////
    // Instance Methods //
    //////////////////////
    public static ArrayList<String> seniorFilter(Person[] personList){
        ArrayList<String> tempList = new ArrayList<String>();
        for (int i = 0; i < personList.length; i++) {
            if (personList[i].getAge() >= 60) {
                tempList.add(personList[i].getName());
            }
        }

        return tempList;
    }
}


class Person {
    private String name;
    private int age;
    private char gender;
    private boolean sharingConsent;


    //////////////////
    // Constructors //
    //////////////////
    // The no-arg Constructor
    // Extra note: There is 2 ways to define a class instance in the main code without any parameters
    // 1. Define a no-arg Constructor
    // 2. By default, if no Constructors is defined in the class, then class instances are automatically
    //    set to be defined without any parameters
    public Person(){
        // System.out.println("Person No-Arg Constructor");
        this.name = "nil";
        this.age = 0;
        this.gender = 'N';
        this.sharingConsent = true;
    }

    // The 3-arg Constructor
    public Person(String name, int age, char gender, boolean sharingConsent){
        // System.out.println("Person 3-Arg Constructor");
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.sharingConsent = sharingConsent;
    }


    /////////////////////////////
    // Accessor/getter methods //
    /////////////////////////////
    public int getAge(){
        return age;
    }

    public boolean getSharingConsent(){
        return sharingConsent;
    }

    public String getName(){
        if (this.getSharingConsent() == true){
            return this.name;
        } else{
            return "Anonymous";
        }
    }


    /////////////////////////////
    // Mutuator/setter methods //
    /////////////////////////////
    public void setAge(int age){
        this.age = age;
    }


    //////////////////////
    // Instance Methods //
    //////////////////////
    public String toString(){
        return "Person: " + this.name + " " + this.gender + " " + this.age;
    }

}