import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String name = "Arman Hossen"; //%s
        char  section = 'c';          //%c
        int age = 23;                 //%d
        double  height = 68.80;        //%f
        boolean isStudent = true;     //%b

        //using printf , and spaecifier-character
        System.out.printf("Assalamualaikum %s\n", name);
        System.out.printf("Your section is %c\n", section);
        System.out.printf("Your age is %d\n", age);
        System.out.printf("Your height is %.2f inches.\n", height);
        System.out.printf("You're a student = %b\n", isStudent);

        // printf() = is a method used to format output
        // %[flags][width][.precision][spaecifier-character]

        System.out.println();
        // '+' = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive



        //%f  by default prints  6 digits after dot
        double p1 = 8.99;
        System.out.printf("p1 = 8.99, if i use percet point 1f = %.1f\n", p1); //for .1f it if the .digits is greater or same as 5 then it will add 1 with the integer part

        double p2 = 202.293;
        double p3 = -304.934;
        //to display '+' before positive number just add '+' after % like this, for minus value there will be automaticly minus sign before the value
        System.out.printf("p2 = 202.293, if i use percet '+' point 2f = %+.2f\n", p2);
        //System.out.printf("p2 = 202.293, if i use percet '-' point 2f = %-.2f\n", p2); this will create error, so don't use minus in %-.numf
        System.out.printf("p3 = -304.934, if i use percet '+' point 2f = %+.2f\n", p3);
        System.out.println();

        //usin commma // if the number is greater then 1000 then it creates a comma to separate the number to easy read
        double sells = 340303.0034;
        //double sells = 1303.0034; //if sells = 1303.0034;, then sells is 1,303.0034
        System.out.printf("sells is %,.4f\n", sells); //sells is 340,303.0034


        // using ( after %, if the number is negative then it will be inside ()
        double negNum = -304.83;
        System.out.printf("negNum = -304.83, using ( after %% = %(.2f\n", negNum);
        // negNum = -304.83, using ( after % = (304.83)

        System.out.println();
        double posNum = 2025;
        double negN = -2023;
        //using space  will display a minus if negative , space if positve
        //not %.2f, using here a space after percent symbole = % .2f
        System.out.printf("posNum = 2025, = % .0f\n", posNum);
        System.out.printf("negN = -2023,  = % .0f\n", negN);
        //it's good for lining numbers
        //posNum = 2025, =  2025
        //negN = -2023,  = -2023

        System.out.println();
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7891;
        System.out.printf("%d\n",id1);
        System.out.printf("%d\n",id2);
        System.out.printf("%d\n",id3);
        System.out.printf("%d\n",id4);
        /*
        1
        23
        456
        7891
        */

        System.out.println();
        //if i want to zero paded by 4 digit in left side then
        System.out.printf("%04d\n",id1); //0001
        System.out.printf("%04d\n",id2); //0023
        System.out.printf("%04d\n",id3); //0456
        System.out.printf("%04d\n",id4); //7890

        scan.close();

    }
}