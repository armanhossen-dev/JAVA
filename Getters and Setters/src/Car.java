public class Car {
    //if i want to be a attribute Unwritable i have to use , "private final"
    private final String name; // now name will never be changed after creating it
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
                + "\nCar Color = " + color + "\n");
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


//getters - to read or return the value of a attributes and can access private variables or attributes
//    returntypeWillBeSameAsDatatypeOFAttribute getAttributeName(){
//        return this.AttributeName;
//    }
//    return type, return, and no parameter in those function
    /// getters
    String getName(){
        return this.name;
    }
    String getModel(){
        return this.model;
    }
    String getPrice(){
        return "$"+this.price;
    }
    String getColor(){
        return this.color;
    }

//    after creating a car object we can not change its model or name (in real world, sometimes some modify can be done) we can change its color or price
//    setters - can write or change the private attribute
//    setter methods, it should have parameters and return type is void, nothing is gonna returned
//   no return type (void), no return, and must have same parameter in those function
    /// setter
    void setColor(String color){
        this.color = color;
    }
    void setPrice(int price){
        //this.price = price;
        //lets add some logic or rules
        if(price < 0){
            System.out.println("Price can't be less than zero!");
        }else{
            this.price = price;
        }
    }
}