// Problem 8: Reverse an Array (Array + for loop)
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    //  input
        Scanner sc = new Scanner(System.in);
        int[] ip = new int[5];
        int[] op = new int[5];
        for(int i = 0; i<5; i++){
            ip[i] = sc.nextInt();
        }
        for(int j = 4, i = 0; j>-1; j--, i++){
            op[i] = ip[j];
        }
        for(int num : op){
            System.out.print(num + " ");
        }
        sc.close();
    }
}
