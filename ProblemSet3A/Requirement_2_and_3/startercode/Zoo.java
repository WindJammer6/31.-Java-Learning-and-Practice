package Requirement_2_and_3.startercode;

import java.util.*;

public class Zoo {

    private AnimalFactory animalFactory;
    private List<Animal> animalList;

    Zoo(AnimalFactory animalFactory){
        // TODO Complete the constructor
        this.animalFactory = animalFactory;
        this.animalList = new ArrayList<Animal>();
    }

    public void addAnimal(String type, String name){
       // TODO Complete this method
        Animal newAnimal = animalFactory.createAnimal(type, name);
        if (newAnimal != null){
            this.animalList.add(newAnimal);
        }
    }

    public String performConcert(){
        // TODO Complete this method
        String s = "";
        for (Animal a : this.animalList){
            s = s + a.makeSound() + "*";
        }
        return s;
    }

    @Override
    public String toString() {
        // TODO Complete this method
        return animalList.toString();
    }


}
