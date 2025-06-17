//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int inputsize = 5;
//        int[] inputArray = new int[inputsize];
//
//        for(int i = 0; i<inputsize; i++){
//            inputArray[i] = sc.nextInt();
//        }
//        Arrays.sort(inputArray);
//        System.out.println("Maximum: " +  inputArray[inputArray.length-1]);
//    }
//}

// Problem 7: Find Maximum in an Array (Array + for loop)
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int[] num_array = new int[5];
        int max = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 5; i++){
            num_array[i] = sc.nextInt();
            if(i == 0){
                max = num_array[0];
            }
            if(i > 0){
                if(num_array[i] > max){
                    max = num_array[i];
                }
            }
        }
        System.out.println("Maximum: " + max);
    }
}