public class Main {
    public static void main(String[] args){

        car mycar = new car("Lamborgini", "white");
        //mycar.drive();

        car car1 = new car("Mustang" , "Red");
        car car2 = new car("Corvette" , "Blue");
        car car3 = new car("Charger" , "Yello");

        //Array of Objects
        //we are going to create array of car objects , so the data type will be 'car' object, so car[]
        //car[] cars = new car[3];
        //arrayDataType[] arrayName = new ArrayDataType[size_of_array_or_elements_number]

        car[] cars = {car1,car2,car3};
        for(car a : cars){
            a.drive();
            // System.out.println(a.color);
            // System.out.println(a.modelName);
            //System.out.println();
        }
        System.out.println();
        car[] mycollections = {new car("BMW", "white"),
                               new car("Mercedes-Benz", "black"),
                               new car("Tesla", "red"),
                               new car("Rolls-Royce", "black"),
                               new car("Bugatti", "white"),
                               new car("Lamborghini", "sky blue"),
                               new car("Aston Martin", "silver"),
                               new car("Porsche", "red"),
                               new car("Maserati", "yellow"),
                               new car("McLaren", "Orange")};

        //without creating object just directly declaring them inside {} , like this
        //                              {new car("BMW", "white"),
        //                               new car("Mercedes-Benz", "black"),
        //                               new car("Tesla", "red"),
        //                               new car("Rolls-Royce", "black"),
        //                               new car("Bugatti", "white"),
        //                               new car("Lamborghini", "sky blue"),
        //                               new car("Aston Martin", "silver"),
        //                               new car("Porsche", "red"),
        //                               new car("Maserati", "yellow"),
        //                               new car("McLaren", "Orange")};
        // These are anonymous objects, we have not given them a unique identifier.
        for(car mcar : mycollections){
            mcar.drive("Arman");
        }

        //lets change all cars color to black
        for(car c : mycollections){
            c.color = "black";
        }
        System.out.println();


        //now display them
        for(car d : mycollections){
            d.drive();
        }
    }
}
