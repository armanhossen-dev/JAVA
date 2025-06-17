import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    //https://youtu.be/xTtL8E4LzTQ?t=29675
    // Runtime polymorphism = when the method that gets executed is decided
    //                        at runtime based on the actual type of the object.

    //  here animal class is an abstract class so we can't create this animal class's object
    //  Animal animal = new Animal(); // this line gives an error
    //we can create // Animal animal = new Cat(); // or
                                  // = new Dog();
        Scanner sc = new Scanner(System.in);
        Animal animal;
        System.out.print("Would you like  a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = sc.nextInt();
        sc.nextLine();

        // before going to create an object we don't know that what we are gonna create
        // this is runtime or dynamic polymorphism

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }else{
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}