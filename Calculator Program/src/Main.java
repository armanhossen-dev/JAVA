import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //simple calculator program usign enhanced switch

        Scanner scan = new Scanner(System.in);
        //+-*/
        double num1, num2, result = 0;
        char operator;
        boolean validOP = true;

        System.out.print("Enter the first number = ");
        num1 = scan.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^) : ");
        operator = scan.next().charAt(0); //taking only the operator as char not string
        scan.nextLine();

        System.out.print("Enter the second number = ");
        num2 = scan.nextDouble();

        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;

            case '/' -> {
               // result = num1 / num2; // some/0 = Infinity
                if(num2 == 0){
                    System.out.println("Cann't divide by zero!");
                    validOP = false;
                }else{
                    result = num1 / num2;
                }
            }

            case '^' ->{
                result = Math.pow(num1, num2);
                result = Math.round(result * 100.00) / 100.00; // to make the valeu 2 digit after decimal point
            }

            default -> {
                validOP = false;
                System.out.println("Invalid Operator!");
            }
        }

        if(validOP){ //if valid operation is true,or valid operator is inserted or input
            System.out.println("result = "+ result);
        }
        scan.close();
    }
}