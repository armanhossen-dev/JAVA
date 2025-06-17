// Problem 3: Sum of First N Natural Numbers (for loop)
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i;
        }
        System.out.print("Sum = "+ sum +" (");
        for(int i = 1; i<=n; i++){
            System.out.print(i);
            if(i<n){
                System.out.print("+");
            }
        }
        System.out.println(")");

        sc.close();
    }
}