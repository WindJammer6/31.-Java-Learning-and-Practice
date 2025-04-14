public class TestDogs {

    public static void main(String[] args) {
        System.out.println("Write your own code");
        Dog dogHusky = new Husky("Mr White");
        System.out.println(dogHusky.makeSound());
        System.out.println(dogHusky.wagTail());

        Dog[] dogs = { new Husky("Fido"), new Retriever("Buddy") };
        for (Dog dog : dogs) {
            System.out.println(dog.makeSound());
            System.out.println(dog.wagTail());
        }
        // TODO As an exercise, rewrite the code above using an ArrayList

    }

    // Expected Output:
    // Mr White howls
    // Mr White wags tail
    // Fido howls
    // Fido wags tail
    // Buddy says woof
    // Buddy moves tail
}
