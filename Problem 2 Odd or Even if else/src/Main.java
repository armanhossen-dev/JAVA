// Problem 2: Odd or Even (if-else)
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is Even");
        }else{
            System.out.println(num + " is Odd");
        }
        sc.close();
    }
}
