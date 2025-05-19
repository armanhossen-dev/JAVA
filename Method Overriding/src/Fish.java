public class Fish extends Animal{
    // this is method overriding, also i have to write '@Override' to the upside line of the void move() function in Fish class
    @Override
    void move(){
        System.out.println("This fish is swimming");
    }

}
