import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        /// https://youtu.be/xTtL8E4LzTQ?t=18213
        // array = a collection of values of the same data type
        // think of it as a variable that can store more than 2 value

        String fruit = "Apple";
        System.out.println("fruit = "+fruit);

        String[] fruits = {"apple", "orange", "banana", "coconut"};
        //System.out.println(fruits); //we get a memory address //[Ljava.lang.String;@27716f4
        ///array is a referance type variable
        //System.out.println(fruits[0]); // apple

        //we can change it elements value by index
        fruits[0] = "mango";


        //length of array to find how many element it has
        int numOfFruits = fruits.length; //4
        System.out.println();

        //for(int i = 0; i < fruits.length; i++ ){
        for(int i = 0; i < numOfFruits; i++ ){
                System.out.print(fruits[i] + " ");
        }

        System.out.println("\n");
        System.out.println("Enhance for loop / for each loop");
        System.out.print("Before Sorting : ");
        for(String singlefruit : fruits){
            System.out.print(singlefruit + " ");
        }
        System.out.println();


        //sort an array
        //i have to import the class 'Arrays'
        // import java.util.Arrays;
        Arrays.sort(fruits); // for string this will sort them by alphabetic order
        System.out.print("Arrays.sort(fruits): ");
        for(String f : fruits){
            System.out.print(f + " ");
        }

        System.out.println();
        //filling all the element's value of an array by a given value
        Arrays.fill(fruits, "apple");
        for(String f : fruits){
            System.out.print(f + " ");
        }
    }
}