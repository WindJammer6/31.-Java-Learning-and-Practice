//Edit this class
public class Husky implements Dog {

    private String name;


    //////////////////
    // Constructors //
    //////////////////
    // The 1-arg Constructor
    Husky(String name){
        // System.out.println("Husky 1-Arg Constructor");
        this.name = name;
    }


    //////////////////////
    // Instance Methods //
    //////////////////////
        @Override
        public String makeSound(){
        return this.name + " howls";
    }

        @Override
        public String wagTail(){
        return this.name + " wags tail";
    }

}
