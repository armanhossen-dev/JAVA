// Problem 9: Count Even and Odd Numbers in an Array
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int[] in = new int[5];
        int cEven = 0, cOdd = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<5; i++){
            in[i]  = sc.nextInt();
            if(in[i] % 2 == 0){
                cEven ++;
            }else{
                cOdd ++;
            }
        }
        System.out.println("Even Count: " + cEven);
        System.out.println("Odd Count: " + cOdd);
    }
}