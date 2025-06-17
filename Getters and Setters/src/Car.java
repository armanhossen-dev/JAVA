public class Car {
    private String name;
    private String model;
    private String color;
    private int price;

    Car(String name,String model, String color, int price){
        this.name =name;
        this.model = model;
        this.color = color;
        this.price = price;
    }
    void displayCarInfo() {
//      System.out.println(name + " " + model + " " + color + " " + price);
        System.out.print("Car name = " + name
                + "\nCar Model = " + model
                + "\nCar Color = " + color
                + "\n");
        System.out.printf("Car Price = $%,d", price);
    }

//  In Java, the %,d format in System.out.printf() uses Western/US-style grouping,
//  which means it inserts commas after every 3 digits (e.g., 1,500,000).

//  Indian-style formatting like 15,00,000, you need to manually format it
//  or use NumberFormat with a custom locale or pattern.
/*
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {
    public static void main(String[] args) {
        int price = 1500000;

        // Custom pattern for Indian currency format
        DecimalFormat formatter = new DecimalFormat("##,##,###");
        String formatted = formatter.format(price);

        System.out.println("Car Price = $" + formatted);
    }
}
*/

    ///getters - to read or return the value of a attributes and can access private variables or attributes
//    returntypeWillBeSameAsDatatypeOFAttribute getAttributeName(){
//        return this.AttributeName;
//    }
    String getName(){
        return this.name;
    }
    String getModel(){
        return this.model;
    }
    int getPrice(){
        return this.price;
    }
    String getColor(){
        return this.color;
    }


}
