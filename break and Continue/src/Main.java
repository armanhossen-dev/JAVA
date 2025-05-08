import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //break = break out of a loop (stops the loop)
        // continue = skip current iteration of a loop (skips the next statements of a the loop)

        Scanner scan = new Scanner(System.in);
        for(int i = 0; i<10; i++){
            //System.out.print( i + " "); // 0-5 print then stops the loop // 0 1 2 3 4 5
            if(i == 5){
                break; // stop the loop
            }
            System.out.print( i + " "); // 0-4 prints side by side // 0 1 2 3 4
        }
        System.out.println();


        for(int j = 0; j<=20; j++){
            if(j == 4 || j == 10 || j == 15){
                continue; // this will skip the iteration or next statements of te loop, and went back to the loop
                //4, 10, 15 will not be printed
                //0 1 2 3 5 6 7 8 9 11 12 13 14 16 17 18 19 20
            }
            System.out.print(j + " ");
        }

        scan.close();
    }
}
