import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // nested loop = A loop inside another loop
        //               used often with matrices or DS&A

        //print num 1 to 9
        for(int i = 1; i<= 9; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        //matrix
        for(int j = 0; j<3; j++){
            for(int k = 0; k < 3; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();


        //matrix create by row & column
        int r, c;
        System.out.print("Enter row: ");
        r = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Column: ");
        c = sc.nextInt(); sc.nextLine();
        System.out.print("Enter a Character or Symbol (for Rectangle): ");
        char symbol1 = sc.next().charAt(0); //taking a single character from output screen
        sc.nextLine();
        for(int a = 0; a <r ; a++){
            for(int b = 0; b<c; b++){
                System.out.print(symbol1);
            }
            System.out.println();
        }



        //lets print Pyramid of star or hash or given char
        System.out.print("Enter a Character or Symbol (for Pyramid): ");
        char ch2 = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("how many row: ");
        int row = sc.nextInt();

        //System.out.print("how many column: ");
        //int col = sc.nextInt();

        for(int i = 0; i< row; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(ch2);
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
                System.out.print(" "); // k = 1-4 space , as i = 0 - 4,  k < row -i
                                                                        // 4 < 5-0 first time
            }
            for(int j = 0; j <= i; j++){
                System.out.print(ch2);
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
