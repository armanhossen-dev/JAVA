import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //lets print Pyramid of star or hash or given char
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Character or Symbol: ");
        String ch = sc.next();
        sc.nextLine();

        System.out.print("how many row: ");
        int row = sc.nextInt();

        System.out.print("how many column: ");
        int col = sc.nextInt();

        for(int i = 0; i< row; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
        /*
            t
            tt
            ttt
            tttt
            ttttt
         */



        for(int i = 0; i< row; i++){
            for(int k = 1; k <row - i; k++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
        /*
                5
               55
              555
             5555
            55555
         */


        



        sc.close();


    }
}
