public class Main {
    public static void main(String[] args){
        // They help protect object data and add rules for accessing or modifying them.
        // getters = Methods that make a field 'Readable'.
        // setters = Methods that make a field 'Writeable'.


    Car c1 = new Car("BMW","M4 CS","Black",  150000);
    //    c1.displayCarInfo();
// c1.model = "M5"; // java: model has private access in Car
// here i can use Car class's attributes to change its model attribute but if
// set private before those declaration of attributes in that class like this, presetting the data types private , now i can not access them
// private String model; // then i can't access that from main function or other, i can only assign value to int by constractor method


        // to change those attribute lets create method with the return type of those attributes datatype - getter
        // now i can access those attributes read it - getter method!

        System.out.println(c1.getName());
        System.out.println(c1.getModel());
        System.out.println(c1.getColor());
        System.out.println(c1.getPrice());

        System.out.println();

//now to change any private attribute we use setter methods, think we can not change name or model,
//        we can change or update the price, and color
        c1.setColor("Blue");
        c1.setPrice(200000);
//        c1.setPrice(-200000); // color will be changed but not the price
//        c1.displayCarInfo();
        System.out.println(c1.getName());
        System.out.println(c1.getModel());
        System.out.println(c1.getColor());
        System.out.println(c1.getPrice());
    }
}
