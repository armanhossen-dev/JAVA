import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Slot machine
        Scanner scan = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain = "Y";

        System.out.println("*************************");
        System.out.println("  Welcome to Java Slots  ");
        System.out.println("Symbols : 🌸 🍉 🧁 🍷 🚀");
        System.out.println("************************");

        while(balance > 0){
            System.out.printf("Current balance : $%,d\n", balance);
            System.out.print("Place your bet amount: ");
            bet = scan.nextInt(); // the new line creates buffer
            scan.nextLine();

            if(bet > balance){
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            }
            else if(bet <= 0){
                System.out.println("Bet must be greater than 0");
                continue;
            }else{
                balance -= bet; // the money he betting will be minus from total balance
                //System.out.println("After bet, balance : $" + balance);
            }
            System.out.println("Spinning...");
            row = spinRow();
            print_Spin_Row(row);
            payout = getPayOut(row,bet);

            if(payout > 0){
                System.out.printf("You won $%,d\n",payout);
                balance += payout;
                System.out.printf("New Balance : %,d\n",balance);
            }else{
                System.out.println("sorry you lost this round!");
            }
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scan.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){

                break;
            }
        }
        System.out.printf("GAME OVER! Your final balance is $%,d\n",balance);

        scan.close();

    }
    static String[] spinRow(){
        String[] symbols = {"🌸", "🍉", "🧁", "🍷", "🚀"};
        String[] row = new String[3];
        Random random = new Random();

        //System.out.println(symbols[random.nextInt(symbols.length)]); //only 5 : 0-4, or (0,5) :  first num is inclusive and second number it exclusive
        for(int i = 0; i<3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        //System.out.println(row[0] +  " " + row[1] +  " " + row[2])
        return row;
    }
    static void print_Spin_Row(String[] row){
        //System.out.println(row[0] +  " " + row[1] +  " " + row[2])
        System.out.println("***************");
        System.out.println("  " + String.join(" | ", row)); // this 'String.join(" | ", row)' makes all the elements of row join by " | " and print it
        System.out.println("***************");
    }
    static int getPayOut(String[] row, int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[0]){
               //🌸 🍉 🧁 🍷 🚀
                case "🌸" -> bet * 30;
                case "🍉" -> bet * 40;
                case "🧁" -> bet * 50;
                case "🍷" ->  bet * 60;
                case "🚀" -> bet * 1000;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1])){ // first 2 matches
            return switch (row[0]){
                //🌸 🍉 🧁 🍷 🚀
                case "🌸" -> bet * 10;
                case "🍉" -> bet * 15;
                case "🧁" -> bet * 20;
                case "🍷" -> bet * 25;
                case "🚀" -> bet * 300;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){ // second 2 matches
            return switch (row[1]){
                //🌸 🍉 🧁 🍷 🚀
                case "🌸" -> bet * 20;
                case "🍉" -> bet * 25;
                case "🧁" -> bet * 35;
                case "🍷" -> bet * 45;
                case "🚀" -> bet * 600;
                default -> 0;
            };
        }
        else if(row[0].equals(row[2])){ // first and last
            return switch (row[0]){
                //🌸 🍉 🧁 🍷 🚀
                case "🌸" -> bet * 30;
                case "🍉" -> bet * 45;
                case "🧁" -> bet * 55;
                case "🍷" -> bet * 60;
                case "🚀" -> bet * 700;
                default -> 0;
            };
        }
        return 0;
    }

}


/*
    declare variables
    display welcome message
    paly if balance > 0
    enter bet amount
        verify if bet > balance
        verify if bet > 0
        substract bet from balance
    spin row
    print row
    get payout
    ask to play again
    display exit message
 */
