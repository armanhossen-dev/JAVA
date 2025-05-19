public class Student extends Person{
//    Since student inherits from the person class, this student class will have fname, lname, and showfullname().
    double gpa ;
    Student(String first_name, String last_name, double gpa){ // this line shows error
        //because  'this.fname = first_name;  this.lname = last_name;' this two line doesn't comes in Student, we have to pass those value to its parent, so we can use super(pass values by , )

        //        super = [Refers to the parent class] (subClass <- superClass)
        //                used in 'constructors' and methods 'overriding'
        //                calls the parent 'constructor' to initialize attributes
        // super keyword forward the value to the current class to parents class, here parent class is Person class
        // i have taken this first_name , last_name, now i have to assign them so i pass them to super or parents class
        super(first_name, last_name);
        //or Person(first_name, last_name);
        this.gpa = gpa;
    }

    void showgpa(){
        // fname, lname is from Person class
        System.out.println( this.fname + "'s gpa is " + gpa);
    }
}