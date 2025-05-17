public class car {
    //attributes - things that an object has
    String make = "Ford";
    String model = "Mustang";
    int year = 2024;
    double price = 58000.99;
    boolean isRunning = false;

    void startCar(){
        isRunning = true;
        System.out.println("You start the engine");
    }
    void stopCar(){
        isRunning = false;
        System.out.println("You stop the engine");
    }

    void drive(){
        System.out.println("You drive the "+ model);
    }
    void break(){}
    //https://youtu.be/xTtL8E4LzTQ?t=24580




}
