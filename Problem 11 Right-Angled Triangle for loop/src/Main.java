// Problem 11: Right-Angled Triangle (for loop)
public class Main {
    public static void main(String[] args){
        int n = 5;
        for(int i = 1; i<=5; i++) {
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<= n-(n-i); k++){
               System.out.print("#");
            }
            System.out.println();
        }
    }
}
/*
    #
   ##
  ###
 ####
#####
*/
