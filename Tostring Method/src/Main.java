public class Main {
    public static void main(String[] args){
        // .toString() = Method inherited from the object class.
                       //used to return a string representation of an object.
                       //By default, it returns a hash code as a unique identifiers.
                       //It can be overridden to provide meaningful detatils.
        Car car = new Car("Ford", "Mustang", 2025, "red");

        System.out.println(car); // Car@8efb846, this is the hash code
        // this is the hash code - a unique identifiers, (for that object,) that use objects memory address to calculate

        //hash code is a




    }
}
