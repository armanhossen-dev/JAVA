//Problem 20: Reverse an ArrayList
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int num;
        ArrayList<Integer> ns = new ArrayList<Integer>(n);
        for(int i = 0; i<n; i++){
            num = sc.nextInt();
            ns.add(num);
        }
        //Collections.sort(ns, Collections.reverseOrder()); // descending order
        Collections.reverse(ns); //in Reverse order
        System.out.println(ns);
//        42 12 89 33 5
//        [5, 33, 89, 12, 42]
    }
}
