import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] foods = {}; // this array doesn't has any element and later i can't assing any element to it
        //System.out.println(foods); // address : [Ljava.lang.String;@27716f4
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
        System.out.println();

        //lets take input from the user:
        /*
        System.out.println("Enter 3 name of foods : ");
        f[0] = scan.nextLine();
        f[1] = scan.nextLine();
        f[2] = scan.nextLine();
        System.out.println("You have entered : ");
        for(String food_name : f) {
            System.out.println(food_name + " ");
        }
        System.out.println('\n');
         */

        //taking how many elements for an array ,array size from user
        /// yes this works
        /*
        System.out.print("Enter how many food you want? : ");
        int num = scan.nextInt();
        scan.nextLine();
        String[] Userfood = new String[num];
        for(int i = 0 ; i<Userfood.length; i++){
            System.out.printf("Entre food no.%d : ",i+1);
            Userfood[i] = scan.nextLine();
        }

        System.out.println();
        System.out.println("User's Food's Are : ");
        for(int j = 0; j<Userfood.length; j++){
                System.out.printf("%d. %s\n", j+1, Userfood[j]);
        }
        System.out.println();
         */
        //or
        System.out.println();


        String[] food_order;
        int size;

        System.out.print("How many food you want to order : ");
        size = scan.nextInt();
        scan.nextLine();

        food_order = new String[size];

        for(int i = 0; i< size; i++){
            System.out.printf("Enter food no. %d : ", i+1 );
            food_order[i] = scan.nextLine();
        }

        System.out.println("\nYou ordered :");
        for(int j = 0; j<size; j++){
            System.out.printf("%d. %s\n", j+1, food_order[j]);
        }
        scan.close();
    }
}