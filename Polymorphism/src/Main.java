public class Main {
    //https://youtu.be/xTtL8E4LzTQ?t=29265

    public static void main(String[] args){
        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                objects can identify as  other objects.
        // like a dog can be identify as dog, animal, organism, object ,
        //                objects can be treated as objects of a common superclass

        //we will create a superclass of vehicle
        /*
        Car car1 = new Car();
        Bike bike1 = new Bike();
        Boat boat1 = new Boat();

        //car1.go();
        //bike1.go();
        //boat1.go();

        //Bike[] bike = {car, bike, boat}; ,, if we want to make an array of  vehicles then bike , car, boat can not be in a same array if the datatype is car, bike or boat type array,
        // there should be something common between them


        System.out.println('\n');
        //Objects can be treated as objects of a common superclass.
        Vehicle[] vehicles = {car1, bike1, boat1}; //they all extending the vehicle super class , now using for each loop
        for(Vehicle v : vehicles){
            v.go();
        }

        // this is polymorphism,
        // the all have extending same superclass,
        // and they can be array elements of that super car,
        // and while use they can be as their Override

        */

        //also i can use interface here
        // i have deleted those class  ,class word and changed them to interface for the next experiment to achive polymorphism by interface

        Car car1 = new Car();
        Bike bike1 = new Bike();
        Boat boat1 = new Boat();

        //Objects can be treated as objects of a common superclass.
        Vehicle[] vehicles = {car1, bike1, boat1}; //they all implements same interface Vehicle
        for(Vehicle v : vehicles){
            v.go();
        }
//        You drive the car
//        You drive the Bike
//        You sail the Boat

    }
}