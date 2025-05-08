import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //https://youtu.be/xTtL8E4LzTQ?t=13419
        //for loop = execute some code a CERTAIN amount of times
        /*
        for(initialization;condition;increasing or decreasing){
            //code to run as condition is true
        */
        for(int i = 1; i<=10; i+=3){
            System.out.println( i + ". Hello World");
        }

        Scanner scan = new Scanner(System.in);

        /*
        System.out.print("Enter how many times you want to loop : ");
        int n = scan.nextInt();
        for(int i = 0; i<n; i++){
            System.out.println("value of i = " + i);
        }
         */


        //Create a projcet simulating count down
        System.out.print("how many seconds to countdown from?: ");
        //int start = 10;
        int start = scan.nextInt();

        for(int i = start; i>0; i--){
            System.out.println(i);
            //lets wait for 1 second
            Thread.sleep(1000);
            //1k milisecond = 1second, for this
// i have to add like this , 'public static void main(String[] args) throws InterruptedException {'
        }
        System.out.println("Happy New Year!");

        scan.close();
    }
}
