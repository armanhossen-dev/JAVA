// Problem 12: Pyramid Pattern (for loop)
public class Main {
    public static void main(String[] args){
        int n = 5;
        for(int a = 1; a<= n; a++){
            for(int b = 1; b<= n-a; b++){
                System.out.print(" ");
            }
            for(int c = 1; c <= a; c++){
                System.out.print("#");
                if(c >= 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*
    #
   # #
  # # #
 # # # #
# # # # #
*/
