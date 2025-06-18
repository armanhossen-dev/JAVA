//Problem 10: Check Prime Number (for loop + if-else)
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int c = 0;
        for(int i = 1; i<= num; i++){
            if(num % i == 0){
                c++;
            }
        }
        if(c == 2){
            System.out.println(num + " is a Prime Number");
        }else{
            System.out.println(num + " is not a Prime Number");
        }
        sc.close();
    }
}
