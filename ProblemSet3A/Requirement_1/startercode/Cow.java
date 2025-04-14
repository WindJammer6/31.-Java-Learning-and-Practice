package Requirement_1.startercode;

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
        return String.format("Cow:%s says Moo Moo", getName());
    }


}
