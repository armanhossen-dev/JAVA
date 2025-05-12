public class Main {
    public static void main(String[] args){
        //System.out.println("Arman");
        // variable = a reuseable container for value
        //            a variable behaves as if it was the value it contains

        //🟩 Primitive = simple value stored directly in memory (stack)
        //🟦 Reference = memory address (stack) that points to the (heap)

        // Primitive vs Reference
        // ----------   ----------
        // int          string
        // double       array
        // char         object
        // boolean

        //Non-Primitive Data Types --are--> objects
        String greeting = "HELLO";
        int[] nums = {1,2,3,4,5};

        //2 steps to creating a variable
        //--------------------------------
        // 1.declaration
        // 2.assignment

        //💜 int
        int age; //it should be only assigned integer number no double
        int year = 2025;
        int codeSkill = 3;
        age = 22;

        System.out.print("I am ");
        System.out.println(age);
        System.out.println("The year is " + year);
        System.out.println("And I have " + codeSkill + " code skill learned" + '\n');

        //🧡 double
        double cgpa = 3.50;
        System.out.println("cgpa = " +cgpa); //it only prints the 3.5 not the zero at the end
        double price = 23.48;
        //System.out.println(price); //now it prints 23.48
        System.out.println("The total price was $" + price );
        double temperature = -29; //we didn't add any pont and decimal or fraction number at the end,
                    // but if we print this double then it will be .0 at the end of this double number
        System.out.println("The temperature is : " + temperature + '\n'); //The temperature is : -29.0

        //💛 char
        char grade = 'A'; // with a single quote mark like this '' inside there must be only on character
        char symbol = '!';
        char currency = '$';

        System.out.println("My grade was " + grade + "\nThe Teacher was wow" + symbol + "\nShe give me " + currency + "200" + '\n');

        //💚 boolean
        boolean isStudent = true;
        //isStudent -> this called camelCase naming convention, which means
        // if your variable name takes two words the first word is in lowercase
        // and the next word's first letter will be uppercase like this 'isStudent'

        boolean forSale = false;
        boolean isOnlne = true;
        //true = 1, false = 0, here it prints ture or false as assigned

        System.out.println("isOnlne = " + isOnlne);
        System.out.println("forSale = " + forSale);
        System.out.println("isStudent = " +isStudent + '\n');
        //boolean variable is often used in if else condition checking, or in internal program or if statement

        if(isStudent){ //if condition is true then the program or code inside the if body works
            System.out.println("I am a student\n");
        }else{
            System.out.println("I am not married\n");
        }


        //🤍 String , the S is uppercase
        //you may notice that the font color or String is different from  other variables like (int,double, boolean, char)
        String name = "Arman Hossen Ripon";
        String email = "1armanhossen.cse@gmail.com";
        String foodILike = "Black Sweet";
        String carName = "BMW M4 COMPETITION";
        String color = "White";
        String carPrice = "$80,095";

        System.out.println("Hello " + name);
        System.out.println("Your favorite food is " + foodILike);
        System.out.println("Your email is : " + email);
        System.out.println("Your favorite car is " + carName + '\n');

        System.out.println("Your choice is a " + color + ' ' + year + ' ' + carName);
        System.out.println("The car price is "+ carPrice);


        if(forSale){
            System.out.println("There is a " + carName + " for sale");
        }else{
            System.out.println("There is no " + carName + " for sale");
        }

        double pi = 3.14159;
        System.out.println(pi);  //3.14159

    }
}