//Problem 14: Factorial Using Recursion
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int op = facto(n);
        System.out.println("Factorial of " + n +" = " + op );
        sc.close();
    }
    public static int facto(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n * facto(n - 1);
    }
}

//Enter N: 5
//Factorial of 5 = 120