public class Car {
    String makerCompany;
    String modelName;
    int year;
    String Color;

    Car(String make, String model, int year, String color){
        this.makerCompany = make;
        this.modelName = model;
        this.year = year;
        this.Color = color;
    }

    /*
    by default
    System.out.println(object_name); it gives a 'objectName@3lh3ohx'
    because in that object it itself is a class there toString() method is declared

    public String toString(){
            return getClass()getName() + "@" + Integer.tohexString(hashCode());
    }

    so,
    ///to change that we have to come to this objects class and  @Override that method and return value     */

    @Override
    public String toString(){
        return this.Color + " " + this.makerCompany + " " + this.modelName + " " + this.year;
    }
    //now in main class if i use 'System.out.println(car);' then it will print 'red Ford Mustang 2025'

    // .toString() = Method inherited from the object class.
    //used to return a string representation of an object.
    //By default, it returns a hash code as a unique identifiers.
    //It can be overridden to provide meaningful detatils.

}
