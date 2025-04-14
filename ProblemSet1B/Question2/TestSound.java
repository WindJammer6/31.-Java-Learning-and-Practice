package ProblemSet1B.Question2;

public class TestSound {
    // You are not required to modify this class
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow(), new SiberianCat()};

        System.out.println( AnimalConcert.performConcert(animals) );
    }
}


// define all classes (AnimalConcert, Animal, Dog, Cat, Cow, SiberianCat) below this line
class Animal {

    //////////////////////
    // Instance Methods //
    //////////////////////
    public String makeSound() {
        return "I am just an animal";
    }
}

class Dog extends Animal {

    //////////////////////
    // Instance Methods //
    //////////////////////
    @Override
    public String makeSound() {
        return "Woof";
    }

}

class Cat extends Animal {

    //////////////////////
    // Instance Methods //
    //////////////////////
    @Override
    public String makeSound() {
        return "Meow";
    }

}

class Cow extends Animal {

    //////////////////////
    // Instance Methods //
    //////////////////////
    @Override
    public String makeSound() {
        return "Moo";
    }
}


class SiberianCat extends Cat {

}

class AnimalConcert {

    //////////////////////
    // Instance Methods //
    //////////////////////
    public static String performConcert(Animal[] animalArray) {
        String tempString = "";

        for (int i = 0; i < animalArray.length; i++){

            if (i < animalArray.length - 1){
                tempString = tempString + animalArray[i].makeSound() + ", ";
            } else{
                tempString = tempString + animalArray[i].makeSound();
            }
        }

        return tempString;
    }

}