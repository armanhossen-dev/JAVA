public class Student {

    //attributes a student have
    String name;
    int age;
    int roll;
    double cgpa;
    boolean isEnrolled;

    // ip = input
    //after creating attributes then we can use constructor like this
    /*
    Student(String name,int age,int roll,double cgpa,boolean isEnrolled){
    //if i named the parameter of up this line, same as the attribute name then
    this.name = name; // we will do like this, here 'this.name' is the attribute, and '= name' is the parameter of the constructor
    this - refers to  the object , we are currently dealing with
    //or
    objectName.attributeName = parameterName;
    */

    Student(String ip_name,int ip_age,int ip_roll,double ip_cgpa){ //boolean ip_isEnrolled will not be necessary, if a new object for Student is declared then he is already Enrolled
        name = ip_name;
        age = ip_age;
        roll = ip_roll;
        cgpa = ip_cgpa;
        //isEnrolled = ip_isEnrolled;
        isEnrolled = true; //each time a new enrolled , he/she is enrolled so true 😎
    }

    //creating functions a student do, work, functions or methods
    void studying(){
        System.out.println(name + " is studying");
    }
    void goingToSchool(){
        System.out.println(this.name + " is going to school");
    }

}
