import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // while loop = repeat some code forever
                     // while some condition remains true
        // there is 2 type of while loop
        //1. standard while loop, 2. do while loop

        Scanner scan = new Scanner(System.in);
        String name = "";
        while (name.isEmpty()){
            System.out.print("Enter your name : ");
            name = scan.nextLine();
        }
        /*
        if(name.isEmpty()){
            System.out.print("Enter your name : ");
            name = scan.nextLine();
        }
        //if i don't give any input then again that if condition is not checked so the next line i only have Hello, so i have to recheck until the name variable is not empty
        OP:
        Enter your name :
        Hello
         */
        System.out.println("Hello " + name);

        //if have condition that we can't change in that loop , is a infinite loop
        /*
        while (1) {
            System.out.println("HELP! I'M STUCK IN A LOOP");
        } // BUT this will not work, in Intelij as the compiler knows its going run infinte times */


        String response = "";

        while(!response.equals("Q")){
            System.out.println("let's play a game!");
            System.out.print("press Q to quit : ");
            response = scan.next().toUpperCase();
            scan.nextLine();
        }
        System.out.println("You have quit the game");

        int age = 0;
        System.out.print("Enter your age : ");
        age = scan.nextInt();

        ///  we check the condition before the while loop,
        while(age < 0){
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age : ");
            age = scan.nextInt();
        }
        System.out.println("You are " + age + " years old");

        double cg;
        /// do while loop
        do{
            System.out.print("Enter your CGPA : ");
            cg = scan.nextDouble();
            if(cg < 0) {
                System.out.println("CGPA can't be negative bruh!");
            }
            else if(cg > 4){
                System.out.println("CGPA can't be more than 4.00");
            }
        }while(cg < 0 || cg>4.0);
        System.out.println("Your CGPA is " +  cg);

        scan.close();
    }
}
