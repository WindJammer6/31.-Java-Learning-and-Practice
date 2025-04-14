package Requirement_1.startercode;

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
        return String.format("Dog:%s says Woof", getName());
    }

}
