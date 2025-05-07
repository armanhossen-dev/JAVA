import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //  weight conversion program
        /* Pseudocode
        1. declare variables
        2. welcome message
        3. prompt for user choice/input
        4. option 1 convert lbs to kgs //lbs -> Pounds
        5. option 2 convert kgs to lbs
        6. else print not a valid choice
        */
        /// declare variables
        double weight_given, weight_after_Convert;
        int choice;

        /// welcome message
        System.out.println("Weight Conversion Program");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        /// prompt for user choice/input
        System.out.print("Chose an option : ");
        choice = scan.nextInt();         /// test1 System.out.println(choice);

        if(choice == 1){  // '==' double equal sigh to Comparison sign operator
            ///option 1 convert lbs to kgs
            System.out.print("Enter your weight in lbs : ");
            weight_given = scan.nextDouble();
            weight_after_Convert = weight_given * 0.453592;
            System.out.printf("The new weight in kgs is : %.2f KG\n" , weight_after_Convert);
        }
        else if(choice == 2){
            ///option 2 convert kgs to lbs
            System.out.print("Enter your weight in kgs : ");
            weight_given = scan.nextDouble();
            weight_after_Convert = weight_given / 0.453592; // or weight * 2.20462;
            System.out.printf("The new weight in lbs is : %.2f lb\n" , weight_after_Convert);
        }
        else{
            /// else print not a valid choice
            System.out.println("That was not a valid choice");
        }
        scan.close();
    }
}
