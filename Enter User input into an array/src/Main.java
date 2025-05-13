import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] foods = {}; // this array doesn't has any element and later i can't assing any element to it
        System.out.println(foods); // address : [Ljava.lang.String;@27716f4
        //System.out.println(foods[0]); /// error
        System.out.println(foods.length); // 0

        //now creating an empty array , that as space for 3 elements
        String[] f = new String[3];
        // now i can assign value or elements to foods array
        f[0] = "pizza";
        System.out.println(f[0]); //pizza
        f[1] = "toco";
        f[2] = "hamburger";
        for(String a : f){
            System.out.print(a + " ");
        }

        //lets take input from the user:
        System.out.println("Enter 3 name of foods : ");
        f[0] = scan.nextLine();
        f[1] = scan.nextLine();
        f[2] = scan.nextLine();

        System.out.println("You have entered : ");
        for(String food_name : f) {
            System.out.println(food_name + " ");
        }
        scan.close();
    }
}
