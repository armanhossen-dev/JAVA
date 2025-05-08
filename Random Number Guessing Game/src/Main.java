import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int guess, attemps = 0, randomGenerate, i = 0;
        int min = 0;
        int max = 10;
        randomGenerate = random.nextInt(min, max+1); //between 1 to 21, means with 1 but till 20

        System.out.println("Number Guessing Game!!!");
        System.out.printf("Guess the number (%d-%d)\n", min, max);
        do{
            i++;
            System.out.print(i + ". Enter a guess : ");
            guess = scan.nextInt();
            attemps++;

            //check if guess is less or more
            if(guess == randomGenerate){
                break;
            }
            else if(guess < randomGenerate){
                System.out.println("TOO LOW! Try again ⬆");
            }else{
                System.out.println("TOO HIGH! Try again ⬇");
            }

        }while(guess != randomGenerate);

        System.out.println("\nMatched! then number was " + randomGenerate);
        System.out.println("Attemps taken = " + attemps);




        scan.close();
    }
}
