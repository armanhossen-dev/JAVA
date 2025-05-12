import java.util.Scanner;

///A beginner project to understand how the methods work
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        // JAVA BANKING PROGRAM FOR BEGINNERS
        //steps -
        //declare variables
        //display menu
        //get and process user choice
        //showBalance()
        //deposit()
        //withdraw()
        //exit message

        //declare variables
        //Scanner sc = new Scanner(System.in);
        double balance = 0.00;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            //display menu
            System.out.println("##############################");
            System.out.println("####### Banking Program ######");
            System.out.println("##############################");
            System.out.println("#      1. Show Balance       #");
            System.out.println("#      2. Deposit            #");
            System.out.println("#      3. Withdraw           #");
            System.out.println("#      4. Exit               #");
            System.out.println("##############################");

              System.out.print("Enter Your Choice (1-4) : ");
            choice = sc.nextInt();
            System.out.println("##############################");

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> {
                    System.out.println("Thank You! Have a Nice Day 😎");
                    System.out.println("Exiting . . . ");
                    isRunning = false;
                }
                default ->  System.out.println("Invalid Choice, Try Again");
            }
        }
        sc.close(); // the program will end inside the main method so it should be here, no problem i think
    }

    //showBalance()
    static void showBalance(double balance){
        System.out.println("###### SHOWING BALANCE #######");
        System.out.printf("$%,.2f\n", balance);
    }

    //deposit()
    static double deposit(){
        // we can use local scanner but we can move the main scnnner to class scope to use or accessible from any method
        double amount;
        System.out.println("######### DEPOSIT     ########");
          System.out.print("Enter Amount to be Deposited: ");
        amount = sc.nextDouble();

        if(amount < 0){
            System.out.println("🟥 Amount can't be negative");
            return  0;
        }
        else{
            return amount;
        }
    }

    //withdraw()
    static double withdraw(double balance){
        double amount;
        System.out.println("######### WITHDRAW    ########");

        if(balance == 0){
            System.out.println("🟥 Insufficient Funds");
            return  0;
        }
        else if(balance > 0 ){
            System.out.print("Enter Amount to be Withdrawn: ");
            amount = sc.nextDouble();

            if(amount > balance){
                System.out.println("🟥 Insufficient Funds");
                return  0;
            }
            else if(amount < 0){
                System.out.println("🟥 Amount can't be negative");
                return 0;
            }
            else{
                return amount;
            }
        }else{
            return  0;
        }
    }



}
