import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //https://youtu.be/xTtL8E4LzTQ?t=19239
        /// linear search by using single for loop
        System.out.println("Int Array Example!");
        int[] nums = {3,4,5,6,7,8,9,10,11};
        int target = 4;
        boolean isfound = false;

        int howManyNumsElement = nums.length;
        System.out.println("how Many Nums of Element : " + howManyNumsElement);

        System.out.print("Elements of the array : ");
        for(int a  = 0; a < howManyNumsElement; a++){
            System.out.print(nums[a]);
            if(a < howManyNumsElement-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Target to find : " + target);

        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]){
                System.out.println("Element found at index: " + i);
                isfound = true;
                break;
            }
        }
        if(!isfound){
            System.out.println("Element not found in the array");
        }
        System.out.println("\n");
        System.out.println("String Array");
        boolean foodFound = false;
        String[] foods = {"Sweets", "Kacci", "Kabab", "kichuri"};
        String targetStr = "kichuri";

        System.out.print("Available foods : ");
        for(int a  = 0; a < foods.length; a++){
            System.out.print(foods[a]);
            if(a < foods.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("\nSearching for "+ targetStr);

        for(int i = 0 ; i < foods.length; i++){
            if(targetStr.equals(foods[i])){
                System.out.println("food found at index = " + i);
                foodFound = true;
            }
        }
        if(!foodFound){
            System.out.println("food not found.");
        }


    }
}
