package Requirement_2_and_3.startercode;

// Copy and paste your solution for Cat here
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public String getName(){
        String s = "Cat:" + super.getName();
        return s;
    }

    @Override
    public String makeSound(){
        return String.format("%s says Meow", getName());
    }
}
