import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //simple calculator program usign enhanced switch

        Scanner scan = new Scanner(System.in);
        //+-*/
        double num1, num2, resutl;
        char operator;

        System.out.print("Enter the first number = ");
        num1 = scan.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^) : ");

        System.out.print("Enter the second number = ");
        num2 = scan.nextDouble();

        scan.close();
    }
}

