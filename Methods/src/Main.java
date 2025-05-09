import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args){
        // method = a block of reusable code that is executed when called ()
        // like function in c
        //System.out.println("Arman Hossen Ripon");

        /// in programming use D.R.Y -> Don't Repeat Yourself
        happyBirthday();
        happyBirthday();
        happyBirthday();

        String name = "Arman Hossen";
        int age = 22;
        info(name, age);

        double result = sqare(3);
        //System.out.println(sqare(3)); this works ✅
        System.out.println(result);

        System.out.println("cube of 3 = " + cube(3));

    }
    // to create a method in java, go outside the main() method, we create a new method, since we useing static method as main, so the outsider method should be also static
    static void happyBirthday(){
        System.out.println("Happy Birthday To You!");
        System.out.println("Happy Birthday dear you!");
        System.out.println("You are x years old!");
        System.out.println("Happy Birthday to you\n");
    }

    static void info(String n, int a){
        System.out.println("Happy Birthday " + n);
        System.out.println("You are " + a + " years old\n");
    }

    //https://youtu.be/xTtL8E4LzTQ?t=15400
    static double sqare(double number){
        return number*number;
    }

    static double cube(double num){
        return num*num*num;
    }

    static String getFullName(String f, String l){
        return f + " " + l;
    }




}
