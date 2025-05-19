public class Main {
    public static void main(String[] args){
        /*
        Method ovrriding = When a subclass provides its own
                           implementation of a method that is already
                           defined.
                           Allows for code reusability and give specific
                           implementations.
        */
        //class - Dog, Cat, Fish
        //Object - dog1, cat1, fish1
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Fish fish1 = new Fish();

        dog1.move();
        cat1.move();
        fish1.move();
    }
}
