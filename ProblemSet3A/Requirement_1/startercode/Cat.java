package Requirement_1.startercode;

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
        return String.format("Cat:%s says Meow", getName());
    }

}
