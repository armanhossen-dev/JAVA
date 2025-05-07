public class Main {
    public static void main(String[] args){
        /*
        ternary operator '?' = Return 1 of 2 values if a condition is true
        This is a simplified version of the if else statement.

        variable = (condition) ? ifTrue : ifFalse;        */

        int score = 60;
        if(score >= 60){
            System.out.println("You win");
        }else{
            System.out.println("You lose");
        }

        /// ternary operator example
        String passOrFail = (score >=  60) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

        int num = 5;
        String EvenOrOdd = (num % 2 == 0) ?  "even" : "odd";
        System.out.println("Number " + num + " is a " + EvenOrOdd + " number");


        int hours = 13;
        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        System.out.println("time : "+ hours +' '+ timeOfDay);

        double salary = 60000.0;
        System.out.printf("Salary from job : %,.1f$\n", salary);
        double taxRate = (salary >= 40000) ? 0.25 : 0.15;
        double taxPay = (salary * taxRate);
        salary = salary * (1-taxRate);

        System.out.println("The tax i pay : " + taxPay);
        System.out.println("My income i have: " + salary);
        System.out.println("sum of (tax + income): " + (taxPay+salary)); //to sum i have to use () if i didn't use it then ithe value of those variable will be printed int the output screen

    }
}