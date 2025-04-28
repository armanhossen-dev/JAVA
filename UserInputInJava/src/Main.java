import java.util.Scanner;  // this is  a package for Scan from the output screen

public class Main {
    public static void main(String[] args){
        //we accept input -> process it -> produce output

        //creating a scanner object
        Scanner scanner = new Scanner(System.in);
        //here
        //'Scanner' that's the name of the class
        // 'scanner' will be  the obj we working with. and this can now read user input

        //✅ COMMON ISSUES
        System.out.print("Enter a num : ");
        int n = scanner.nextInt();
        //after taking input a number, we hit Enter button ant that also inputs a \n at the end of number
        //so if i again input a text after this number input, i will see input buffer, next input will be only \n so to solve it i
        // have to use this 'scanner.nextLine();' 🙂
        scanner.nextLine(); // only write this after taking an integer to ignore that last \n after while input, and don't assign it to any variable that's it

        System.out.print("Enter your favorite color : ");
        String color = scanner.nextLine();


        System.out.print("Enter Your Name : ");
        //scanner.nextLine(); // this will take  input for a line
        //scanner.next(); // this will take input for a word , if space ' ' found then it stops taking input

        String name = scanner.nextLine(); //Enter Your Name : Arman Hossen Ripon // taking input and assigning it into name String variable
        //System.out.println(name + " is my friend."); //Arman Hossen Ripon is my friend.

        System.out.print("Enter Your Age : ");
        int age = scanner.nextInt(); // this will take inut of integer value

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        double gpa = 0.0; //declare gpa outside , the if blocks the variable
        if(isStudent) {
            System.out.print("What is yor CGPA : ");
            gpa = scanner.nextDouble(); //but double gpa = scanner.nextDouble(); will block the gpa variable and the code will not work , because it is inside a if body
        }



        System.out.println(); //creates a newline bruh
        System.out.println("Hi " + name);
        System.out.println("So you are " + age + " years old");

        if(isStudent){
            System.out.println("Yes, you are a student");
            System.out.println("Your CGPA is : " + gpa + '\n');
        }else{
            System.out.println("Ok, you are not a student\n");
        }


        //CALCULATE AREA OF A RECTANGLE
        double a = 0,b = 0, area = 0;

        System.out.print("Enter width = ");
        a = scanner.nextDouble();

        System.out.print("Enter height = ");
        b = scanner.nextDouble();

        area = a * b;
        System.out.println("Area is = " + area + "cm²"); //numlock then hold 'Alt' + 0178 for square 2

        scanner.close(); //after creating a scanner we need to clse it, if not closed then it will create problems
    }
}
