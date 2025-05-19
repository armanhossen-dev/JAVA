public class Employee extends Person{

    int salary;

    Employee(String fname, String lname, int sal){
        //I have taken this fname , lname, now i have to assign them so i pass them to super or parents class
        //calling  constructor of parent class by super(); keyword, then passing those arguments
        super(fname,lname);
        this.salary = sal;
    }


    void hiName(){
        System.out.println("Hi everyone, i am " + fname + " " + lname + '.');
    }
    void sal(){
        System.out.println(fname + "'s salary is $"+ salary);
    }

}
