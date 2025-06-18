// Problem 13: Fibonacci Series (for loop)
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        int next = 0;
        if(n == 1){
            System.out.println("0");
        }
        if(n == 2){
            System.out.println("0, 1");
        }
        if(n >= 3){
            System.out.print("0, 1, ");
            for(int i = 3; i<=n; i++){
                next = a + b;
                System.out.print(next);
                if(i<n){
                    System.out.print(", ");
                }
                a = b;
                b = next;
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
10
0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/