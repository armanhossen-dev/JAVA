import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args){

        /// for an array of integers
        int[] nums = {1,4,67,7,41};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        //[1, 4, 7, 41, 67]
        System.out.println("Small number: " +nums[0]);
        System.out.println("Big number: " + nums[nums.length-1]);
        System.out.println();


        /// for an array of strings
        String[] names = {"Arman", "Hossen", "Ali", "Khan", "Ripon", "Alice", "John"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println("Last name: " + names[names.length-1]);

        ///Sort in Descending Order (using Comparator with boxed types)
        /// have to import Collections
        
        Integer[] numbers = {20,100,30,00, 49,99,102};
        // Use Integer[] instead of int[] for reverse sorting,
        // because Collections.reverseOrder() only works with objects, not primitives.
        Arrays.sort(numbers, Collections.reverseOrder()); /// for Descending Order
        System.out.println(Arrays.toString(numbers)); // [102, 100, 99, 49, 30, 20, 0]

    }
}
