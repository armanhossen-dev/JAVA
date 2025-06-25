//Problem 21: Add and Display Strings in an ArrayList
import java.util.ArrayList;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            ArrayList<String> names = new ArrayList<String>();
            for(int i = 1; i<=5; i++){
                String n = sc.nextLine();
                names.add(n);
            }
            System.out.println(names);
//            Apple
//            Banana
//            Cherry
//            Mango
//            Orange
//            [Apple, Banana, Cherry, Mango, Orange]
            sc.close();
        }
}


//            int d = 0;
//            System.out.print("Search: ");
//            int target = sc.nextInt();
//            for(int i = 0; i<names.size(); i++){
//                if(names.contains(target)) {
//                    d++;
//                }
//System.out.println(nums.get(i));
//          }
//            if(d!=0){
//                System.out.println(target + " exists in the list.");
//            }else {
//                System.out.println(target + " doesn't exists in the list.");
//            }
