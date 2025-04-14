// TODO Complete this

package Requirement_2_and_3.startercode;;

public class FarmFactory implements AnimalFactory {

    public Animal createAnimal(String type, String name){
        if (type == "Cat"){
            Animal cat = new Cat(name);
            return cat;
        } else if (type == "Cow"){
            Animal cow = new Cow(name);
            return cow;
        } else{
            Animal dog = new Dog(name);
            return dog;
        }
    };

}
