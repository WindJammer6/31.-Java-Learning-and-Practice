package Requirement_2_and_3.startercode;

// Copy and paste your solution for Cow here

public class Cow extends Animal {

    public Cow(String name) {
        super(name);
    }

    public String getName(){
        String s = "Cow:" + super.getName();
        return s;
    }

    @Override
    public String makeSound(){
        return String.format("%s says Moo Moo", getName());
    }

}
