import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //https://youtu.be/xTtL8E4LzTQ?t=11401

        ///  LOGICAL OPERATORS IN JAVA
        // && = AND
        // || = OR
        // !  = NOT

        /*
        double temp = 50.0;
        boolean isSunny = true;

        if(isSunny){
            System.out.println("It's sunny outside");
        }else{
            System.out.println("It's not sunny outside");
        }


        if(temp <= 20){
            System.out.println("The weather is COLD 🥶");
        }
        else if(temp > 20 && temp <=30){
            System.out.println("The weather is GOOD 😄");
        }else if(temp > 30){
            System.out.println("The weather is HOT 🥵");
        }

        if(temp > 30 || temp < 20){
            System.out.println("The weather is BAD");
        }
         */

        Scanner scan = new Scanner(System.in);

        String username ;
        //username must be between 4-12 characters
        //username must not contain spaces or underscores

        System.out.print("Enter your username : ");
        username = scan.nextLine();
        if(username.length() < 4 || username.length() >12){
            System.out.println("Username must be between 4-12 characters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscores");
        }
        else{
            System.out.println("Welcome " + username);
        }
        scan.close();
    }
}

