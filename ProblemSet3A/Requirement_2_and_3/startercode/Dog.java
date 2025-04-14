package Requirement_2_and_3.startercode;


// Copy and paste your solution for Dog here

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public String getName(){
        String s = "Dog:" + super.getName();
        return s;
    }

    @Override
    public String makeSound(){
        return String.format("%s says Woof", getName());
    }

}
