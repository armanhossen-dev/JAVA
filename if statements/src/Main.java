import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //if statement = performs a block of code if its condition is true
        //condition ? value_if_true : value_if_false;
        int  age = 12;
        if(age >= 18) {
            System.out.println("You are an adult!");
        }else{
            System.out.println("You are a child!");
        }
        //if and then else, we have here only 2  possibility

        //we can use multiple condition and check case of if by
        //placing 'else if(){}' between if{} and else{}
        //like this

        String name = "IronMan"; // Arman, IronMan, BroCode
        //❌ if(name == Arman){
        // '==' will is the comparision variable , to find the same value or not, single '=' is for assignment operator
        if(name.equals("Arman")){ //✅ this for the string
            System.out.println("I am Arman");
        }
        else if(name.equals("IronMan")){
            System.out.println("I am IronMan");
        }
        else{
            System.out.println("I am BroCode");
        }


        /// info taking and if else , else if  condition checking

        String firstName;
        System.out.print("Enter your name : ");
        firstName = sc.nextLine();

        int age2;
        System.out.print("Enter your age : ");
        age2 = sc.nextInt();

        boolean isStudent;
        System.out.print("Are you a student?(true/false) : ");
        isStudent = sc.nextBoolean();
        System.out.println();



        //group 1 taking user name
        if(firstName.isEmpty()){ // we can use (firstName == "" )also same condition
            System.out.println("Your didn't enter your name!");
            //firstName.isEmpty() this will return a boolean value, true or false
        }
        else{
            System.out.println("Hello " + firstName + "!");
        }

        //Group2 for user age
        if( age2 >= 65){
            System.out.println("You are a senior🤠");
        }
        else if(age2 >= 18){
            System.out.println("You are an adult!🤭");
        }
        else if(age2 < 0){
            System.out.println("You haven't been born yet!👻");
        }
        else{
            System.out.println("Your are a baby!😲 Say hello World!!!");
        }


        //group 3
        if(isStudent){
            System.out.println("You are a Student 😍");
        }else{
            System.out.println("You are not a student 😛");
        }






        sc.close();
    }
}
