//Problem 22: Find the Longest String in an ArrayList
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        for(int i = 1; i<=5; i++){
            String n = sc.nextLine();
            names.add(n);
        }
        int siz = (names.get(0)).length();
        int idx = 0;
        for(int i = 0; i<5; i++){
            if((names.get(i)).length() >= siz){
                siz = (names.get(i)).length();
                idx = i;
            }
        }
        System.out.println("Longest String: " + names.get(idx));
        sc.close();
    }
}

//a
//arman
//hossen
//ripon
//ali
//Longest String: hossen