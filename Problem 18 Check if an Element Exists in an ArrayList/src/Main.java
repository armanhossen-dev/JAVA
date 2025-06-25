//Problem 18: Check if an Element Exists in an ArrayList
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>(); // datatype "Integer", not int,
//        nums.add(3);
//        nums.add(8);
//        nums.add(12);
//        nums.add(15);
//        nums.add(21);
        for(int i = 1; i<=5; i++){
            int n = sc.nextInt();
            nums.add(n);
        }
        int d = 0;
        System.out.print("Search: ");
        int target = sc.nextInt();
        for(int i = 0; i<nums.size(); i++){
            if(nums.contains(target)) {
                d++;
            }
            //System.out.println(nums.get(i));
        }
        if(d!=0){
            System.out.println(target + " exists in the list.");
        }else {
            System.out.println(target + " doesn't exists in the list.");
        }
        sc.close();
    }
}
