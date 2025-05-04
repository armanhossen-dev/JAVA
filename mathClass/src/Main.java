import java.sql.PreparedStatement;
import java.util.Arrays;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println(Math.PI); //3.141592653589793
        System.out.println(Math.E); // Exponential constant (Euler's number), approximately 2.718281828459045

        double result;
        result = Math.pow(2,3); // 2^3 , Math.pow(base,power); returns a double value
        System.out.println(result); // 8.0

        result = Math.abs(-5); //always gives positive value, absolute value
        System.out.println(result); // 5.0

        result = Math.sqrt(4);  //for sq root
        System.out.println(result); //2.0

        result = Math.round(3.5); // round a number to nearest integer
        System.out.println(result); //4.0

        result = Math.ceil(3.24); // nearest big integer number //4 , normally round up
        System.out.println(result); //4.0

        result = Math.floor(3.5); //always goes to nearest small integer number
        System.out.println(result); //3.0

        result = Math.max(10,20);
        System.out.println(result); // max number(greater number) will be printed, 20.0

        result = Math.min(10,22); // minimum number will be stored, here 10
        System.out.println(result); //10.0

        System.out.println();

        //Practice the Pythagorean Theorem.
        //HYPOTENUSE c = Math.sqrt(a²+b²);

        System.out.println("Right angled triangle");
        System.out.println("c = sqrt(a²+b²)");

        double a, b, c;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the side a = "); a = scan.nextDouble();
        System.out.print("Enter the length of the side b = "); b = scan.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        //System.out.println("So, c = " + c + "cm"); // some times gives more than needed digits after dot
        System.out.printf("The hypotenuse (side c) is : %.2fcm", c);
        System.out.println('\n');


        System.out.println("Calculating a circumference, area, volume by Enter the radius!");
        double r, circumference, area, volume;
        System.out.print("radius = ");
        r = scan.nextDouble();

        circumference = 2 * Math.PI * r;
        area = Math.PI * Math.pow(r,2);
        volume = (4.0/3.0) * Math.PI * Math.pow(r,3);
        System.out.printf("Circumference = %.2f cm\nArea = %.2f cm²\nVolume = %.2f cm³\n", circumference, area, volume);

        //numlock + alt + 0178 -> ² for win
        //numlock + alt + 0179 -> ³ for win
        //(mac)² -> Control + command + space



        scan.close();
    }
}