public class Main {
    //https://youtu.be/xTtL8E4LzTQ?t=26533
    public static void main(String[] args){
        // Inheritance = one class inherits the attributes and methods from another class
        //               Child <- Parent
        Dog dog1 = new Dog();
        dog1.eat(); // The animal is eating, this eat() is from animal class
        System.out.println(dog1.isAlive); // true
        System.out.println();

        Cat cat1 = new Cat();
        cat1.eat(); // The animal is eating
        System.out.println(cat1.isAlive); // true
        System.out.println();

        ///now Animal class is the parent class ,and Dog, Cat is the children class

        System.out.println(dog1.lives);//1
        System.out.println(cat1.lives);//1
        System.out.println();

        dog1.speak(); //Dog : woof!
        cat1.speak(); //Cat : Meow!
        System.out.println();


        //Inherit child <- Parent <- grandparent
        //public class Animal extends Organism
//        public class Organism {
//            boolean isAlive;
//            Organism(){
//                isAlive = true;
//            }
//        }
        System.out.println("dog1.isAlive: " + dog1.isAlive); // true, here isAlive is inside the Organism class, not in the Animal class, so Animal inherit this attribute from Organism class

        Plant plant1 =  new Plant(); //public class Plant extends Organism
        System.out.println("plant1.isAlive: " + plant1.isAlive); //true
        plant1.photosynthesize(); //The plant absorbs sunlight!

    }
}