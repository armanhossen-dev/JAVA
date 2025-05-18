public class Main {
    public static void main(String args[]){
        /*
        //https://youtu.be/xTtL8E4LzTQ?t=24699
        constructor = A special method to initialize objects
                     you can pass arguments to a constructor
                     and set up initial values

         By using a constructor, we can create objects, with unique values
         when you create object, we can pass arguments to a constructor to set up initial values

         work:
         let create a Student class,
         write datatype and variable as attributes a student have
         //attributes a student have
            String name; // if i name or assign value in this class attributes then every time i create a new object by this class all student object will have the same name or value
            int age;
            int roll;
            double cgpa;
            boolean isEnrolled;

            after creating attributes then we can use constructor like this

        /////////////////////////////////////////////////////////////////
        // Calling a constructor when we instantiate an object of that class
        // a constructor is automatically called when a object is created

        Student stu1 = new Student();

                     //instantiate an object '= new Student();'
        // here constructor -> 'Student()', in this () we can pass arguments
        */

        //ip = input
        Student stu1 = new Student("Arman Hossen", 22, 2,3.12);
        // System.out.println("stu1.name = " + stu1.name); //stu1.name = Arman Hossen
        Student stu2 = new Student("Jannatul Ritu", 24, 1, 3.89);
        System.out.println("stu1 = " + stu1.name + ", " + stu1.age + ", " + stu1.roll + ", " + stu1.cgpa + ", " + stu1.isEnrolled);
        System.out.println("stu2 = " + stu2.name + ", " + stu2.age + ", " + stu2.roll + ", " + stu2.cgpa + ", " + stu2.isEnrolled);

        Student stu3 = new Student("Ripon Ali", 20, 0, 4.0);

        System.out.println();

        stu1.studying();
        stu2.studying();
        stu3.studying(); // Ripon Ali is studying

        stu1.goingToSchool(); // Arman Hossen is going to school
    }
}
