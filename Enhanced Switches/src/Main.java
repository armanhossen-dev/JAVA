import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Enhanced Switch = a replacement to many else if statements (java14 feature)
        //there is switch (standard switches), and enhanced switch(java14 feature)

        Scanner scan = new Scanner(System.in);

        //String day = "Monday";
        String day;

        System.out.print("Enter Day Name : ");
        day = scan.nextLine();

        switch (day){  // '->' do this
            /*
            case "Saturday" -> System.out.println("It's a weekday 😆");
            case "Sunday" -> System.out.println("It's a weekday 😆");
            case "Monday" -> System.out.println("It's a weekday 😆");
            case "Tuseday" -> System.out.println("It's a weekday 😆");
            case "Wednesday" -> System.out.println("It's a weekday 😆");
            case "Thursday" -> System.out.println("It's a weekday 😆");
            */ /// or
            case "Sunday", "Monday" ,"Tuseday" ,"Wednesday","Thursday" ->
                    System.out.println("It's a weekday 😆");

            case "Friday" , "Saturday" ->
                    System.out.println("It's a weekend 😎");

            default -> System.out.println(day + " is not a day");
        }

        scan.close();
    }
}
