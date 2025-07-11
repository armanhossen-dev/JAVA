public class Car {
    String Name;
    String Model;
    String Color;
    int Year;
    Engine engineObject;

    Car(String name, String model, String color, int yr, String engineType){
        Name = name;
        Model = model;
        Color = color;
        Year = yr;
        engineObject = new Engine(engineType);
    }

    void start(){
        this.engineObject.start();
        System.out.println("The " + Color + " " + Name + " is running now!");
    }

    void displayCarInfo(){
        System.out.println("Car Info:");
        System.out.println(Color + " "+ Name + " " + Model +" " + Year + " " + engineObject.getEngineType());
    }

}
