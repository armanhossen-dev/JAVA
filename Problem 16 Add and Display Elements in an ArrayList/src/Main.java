import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        //Problem 16: Add and Display Elements in an ArrayList
        ArrayList<Integer> nums = new ArrayList<Integer>(); // datatype "Integer", not int,
        nums.add(10);
        nums.add(15);
        nums.add(20);
        nums.add(25);
        nums.add(30);
//      for(int i = 0; i<nums.size(); i++){
//               System.out.println(nums.get(i));
//      }
        System.out.println(nums);
    }
}
