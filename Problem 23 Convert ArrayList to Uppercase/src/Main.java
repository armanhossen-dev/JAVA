//Problem 23: Convert ArrayList to Uppercase
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        for(int i = 1; i<=5; i++){
            String n = sc.nextLine();
            n = n.toUpperCase();
            names.add(n);
        }
        System.out.println(names);
        sc.close();
    }
}
