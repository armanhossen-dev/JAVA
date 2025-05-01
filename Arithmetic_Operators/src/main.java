import java.util.Scanner;

public class main {
    public static void main(String[] args){
        System.out.println("Todays Topic : Arithmetic_Operators");
        System.out.println();

        Scanner scan = new Scanner(System.in);

        //Arithmetic Operators

        int x = 10;
        System.out.println("x = " + x);
        int y = 2;
        System.out.println("y = " + y);
        int z1,z2,z3,z4,z5,z6;

        z1 = x+y;
        z2 = x-y;
        z3 = x/y;
        z4 = x*y;
        z5 = x%y; //remain
        System.out.println("z1 = x+y = " + z1);
        System.out.println("z2 = x-y = " + z2);
        System.out.println("z3 = x/y = " + z3);
        System.out.println("z4 = x*y = " + z4);
        System.out.println( "z5 = x%y = " + z5);
        //System.out.println(z6);
        System.out.println();
        System.out.println();

        //Augmented Assignment Operators
        int x1 = 10;
        int y1 = 3;
        // x1 = x1 + y1;
        // shortcut  //x += y System.out.println(x1); // 13
        //x1 -= y1; //System.out.println(x1); // 7
        //x1 += y1;
        //x1 *= y1;
        //x1 /= y1;
        //x1 %= y1;


        //Increment and Decrement Operators
        System.out.println("\nIncrement and Decrement Operators\n");
        int a = 1;
        System.out.println("int a = 1; a = " + a); //1

        a = a+1;
        System.out.println("a = a+1; a = " + a); //2

        a += 1;
        System.out.println("a += 1; a = " + a); //3

        int b = a++;
        System.out.println("int b = a++; b = " + b + ',' + " a = "  + a); // b = 3, a = 4

        int c = ++a;
        System.out.println("c = ++ a; c = " + c + ", a = " + a); // c = 5 , a = 5
        System.out.println('\n'); // creates 2 newline

        //same as minus
        int d = 10;
        System.out.println("int d = 10;");

        System.out.println();



        /*
        System.out.print("Enter Car Price : ");
        double price = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter car name : ");
        String Car_name = scan.nextLine();

        System.out.print("Bro for this " + "'" + Car_name + "'" + ", You have to pay $" + price);
        */

        scan.close();
    }
}