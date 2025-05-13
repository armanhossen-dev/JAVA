import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        // JAVA DICE ROLLER PROGRAM

        //1. declare variables
        int num_Of_dice, total = 0;

        //2. get number of dice from user
        System.out.print("Enter the number of dice to roll : ");
        num_Of_dice = scan.nextInt();

        //3. check if number of dice is greater 0, number > 0
        if(num_Of_dice > 0) {
            //System.out.println("You roll the dice");
            //4. roll all the dice
            for(int i = 0; i<num_Of_dice; i++){
                int roll = random.nextInt(1,7); /// range number between 1 and 6 // random.nextInt(inclusive , exclusive); // inclusive is that number which will be in that range, exclusive is that number the numbers before will be the range
                printDie(roll);
                System.out.println("You rolled : "  + roll);
                // we will sum the totat  every time i rolled it, num_of_dice times
                //5. get the total
                total += roll;
            }
            System.out.println("Total : " + total);
        }
        else{
            System.out.println("Number of dice must be greater than 0");
        }
        scan.close();
    }
    //6. display ascii of dice
    static void printDie(int roll){
        //creating ascii arts
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """; // win+r -> charmap then finding a ● then select and copy then apply that in code
            // Anything between """ and """ (three double quotes) is a multiline string in Java.
            //test System.out.println(dice1);
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ● ● ● |
                | ● ● ● |
                | ● ● ● |
                 -------
                """;
        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll!");
        }
    }

}
