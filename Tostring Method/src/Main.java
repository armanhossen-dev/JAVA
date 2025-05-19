public class Main {
    public static void main(String[] args){
        // .toString() = Method inherited from the object class.
                       //used to return a string representation of an object.
                       //By default, it returns a hash code as a unique identifiers.
                       //It can be overridden to provide meaningful detatils.
        Car car = new Car("Ford", "Mustang", 2025, "red");

        //System.out.println(car);
        // Outputs the object's default toString() value,
        // which includes the class name and its hash code (e.g., Car@8efb846).
        // The hash code is a unique identifier generated based on the object's memory address by default.
        // It's used internally by Java (e.g., in hash-based collections like HashMap) to optimize storage and lookup operations.

        // System.out.println(car.Color + " " + car.makerCompany + " " + car.modelName + " " + car.year );
        /*
        after writing this code in Car class
        @Override
        public String toString(){
            return this.Color + " " + this.makerCompany + " " + this.modelName + " " + this.year;
        }
        now insted of giving 'System.out.println(car);'-> 'Car@8efb846'
        'System.out.println(car);'  will give 'red Ford Mustang 2025'
         */
        System.out.println(car);

        Car car2 = new Car("Chevrolet", "Corvette", 2022, "Blue");
        System.out.println(car2); // Blue Chevrolet Corvette 2022


    }
}