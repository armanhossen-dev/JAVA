import java.util.Random;
import java.util.Scanner;

public class Main {
    //https://youtu.be/xTtL8E4LzTQ?t=21560
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // array of choices rock paper scissor
        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scan.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")){
                System.out.println("Invalid Choice!");
            }

            computerChoice = choices[random.nextInt(3)]; // random.nextInt(3) this will return number 0 to 2, (0, 1, 2)
            System.out.println( "Computer choice: " + computerChoice);


            if(playerChoice.equals(computerChoice)){
            /*  In Java:
                Using == to compare strings checks whether both references point to the exact same object in memory (i.e., their memory addresses are the same).
                Using .equals() compares the actual content (the characters) of the two strings.*/
                System.out.println("It's a tie!");
            }else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock"))    ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))){
                System.out.println("You Win!");
            }else{
                System.out.println("You lose!");
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = scan.nextLine().toLowerCase();
        }while(playAgain.equals("yes"));

        System.out.println("Thanks for Playing!");

        scan.close();
        // ROCK PAPER SCISSORS GAME
        // declare variables
        // get choice from user
        // get random choice from computer
        // check win condition
        // ask to play again
        // goodbye message


    }
}
