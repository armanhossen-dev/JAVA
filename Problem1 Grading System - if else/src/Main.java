// Problem 1: Grading System (if else-if else)
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int mark = sc.nextInt();
        if(mark >= 90){
            System.out.println("Grade: A");
        }else if(mark >= 80){
            System.out.println("Grade: B");
        }else if(mark >= 70){
            System.out.println("Grade: C");
        }else if(mark >= 60){
            System.out.println("Grade: D");
        }else{
            System.out.println("Grade: F");
        }
        sc.close();
    }
}