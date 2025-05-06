import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // compound interest calculator
        Scanner scan = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount : ");
        principal = scan.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scan.nextDouble() / 100.0;

        System.out.print("Enter the number of times compounded per year : ");
        timesCompounded = scan.nextInt();

        System.out.print("Enter the number of years : ");
        years = scan.nextInt();

        amount = principal* Math.pow(1 + rate/ timesCompounded , timesCompounded*years);
        System.out.printf("The amount after %d is : $%.2f", years, amount);

        scan.close();
    }
}