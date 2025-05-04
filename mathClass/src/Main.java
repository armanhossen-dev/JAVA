import java.sql.PreparedStatement;
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

        //practice phitagoras theorem
        System.out.println("Right angled triangle");
        System.out.println("c = sqrt(a²+b²)");
        //HYPOTENUSE c = Math.sqrt(a²+b²);
        double a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.print("a = "); a = scan.nextDouble();
        System.out.print("b = "); b = scan.nextDouble();
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("So, c = " + c);
        /*
        a = 4
        b = 3
        So, c = 5.0
        */
    }
}
