import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /* //https://youtu.be/xTtL8E4LzTQ?t=24120
        # in programming an objcet  can represent an real-world entity

        object = an entity that hold data (attributes), 🖤 can have things
                and can perform actions (methods), 🤍 can do things
                it is a reference data type'

        - we store the data for object,  in a location known as heap

        let's create some car objects
        - we will need class,
            class -  A class can serve/behave as a blueprint to create objects
            'src' - 'new' - 'java class' - name it 'car' then enter
         */

        //Scanner is an object, to create an scanner we type like this
        //Scanner scan = new Scanner(System.in);
        //Random random = new Random();

        car car1 = new car();

        System.out.println("car1: "+car1); // we will get an memory address 'car@8efb846'
        //to access the attributes of car, use dot then use those attributes , objectName.attributes
        System.out.println("car1.model: "+ car1.model); // Mustang
        System.out.println("car1.make: " + car1.make);
        System.out.println("car1.year: " + car1.year);
        System.out.println("car1.isRunning: " + car1.isRunning);

        car1.isRunning = true;
        System.out.println("car1.isRunning: "+car1.isRunning);
        System.out.println("car1.price: " + car1.price);
        /*
        car1: car@8efb846
        car1.model: Mustang
        car1.make: Ford
        car1.year: 2024
        car1.isRunning: false
        car1.isRunning: true
        car1.price: 58001.99
         */

        System.out.println();

        car1.stopCar(); // You stop the engine
        System.out.println("car1.isRunning: "+car1.isRunning);
        car1.startCar(); // You start the engine
        System.out.println("car1.isRunning: "+car1.isRunning);
        /*
        You stop the engine
        car1.isRunning: false
        You start the engine
        car1.isRunning: true
         */

        System.out.println();
        car1.drive();
        car1.breaking();
        /*
        You drive the Mustang
        You braek the Mustang
         */



        System.out.println();

        //creating a car object, object name car2,
        //but because we have value of the attribute in the class so they will be pre loaded from the class when we creat a new object

        car car2 = new car();

        System.out.println("car1.make: " + car1.make + " "+ "car1.model: "+ car1.model);
        System.out.println("car2.make: " + car2.make + " "+ "car2.model: "+ car2.model);

        /*
        car1.make: Ford car1.model: Mustang
        car2.make: Ford car2.model: Mustang
         */
        //after creating a object we can change their attributes value
        car2.make = "lambo";
        car2.model = "new";
        car2.year = 2025;
        car2.isRunning = true;
        car2.price = 303000.08;

        System.out.println("car2.model: "+car2.model); // Mustang
        System.out.println("car2.make: " + car2.make);
        System.out.println("car2.year: " + car2.year);
        System.out.println("car2.isRunning: " + car2.isRunning);
        System.out.println("car2.price: " + car2.price);

//        System.out.println();
//        car2.startCar();
//        System.out.println(car2.isRunning);
//        car2.stopCar();
//        System.out.println(car2.isRunning);

        car1.startCar();










    }
}
