package Requirement_2_and_3.startercode;

import java.util.Objects;

public abstract class Animal {

    private String name;

    Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract String makeSound();


    // override toString(), equals() and hashCode()
    //TODO 1 override toString() to return an informative string
    @Override
    public String toString() {
        return this.getName();
    }

    // TODO 2 the implementation using Android studio's wizard
    // or your own IDE's)
    // will be sufficient for equals() and hashCode()
    @Override
    public boolean equals(Object other) {
        if( this == other) return true;
        if( !( other instanceof Animal))return false;
        Animal that = (Animal) other;
        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}