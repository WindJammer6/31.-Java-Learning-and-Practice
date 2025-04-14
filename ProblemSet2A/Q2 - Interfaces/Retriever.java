//Edit this class
public class Retriever implements Dog {

    private String name;

    //////////////////
    // Constructors //
    //////////////////
    // The 1-arg Constructor
    Retriever(String name){
        // System.out.println("Retriever 1-Arg Constructor");
        this.name = name;
    }


    //////////////////////
    // Instance Methods //
    //////////////////////
        @Override
        public String makeSound(){
        return this.name + " says woof";
    }

        @Override
        public String wagTail(){
        return this.name + " moves tail";
    }

}
