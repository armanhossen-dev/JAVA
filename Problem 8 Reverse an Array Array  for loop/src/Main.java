// Problem 8: Reverse an Array (Array + for loop)
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    //  input
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for(int i = 0; i<5; i++){
            array[i] = sc.nextInt();
        }
        sc.close();
    }
}
