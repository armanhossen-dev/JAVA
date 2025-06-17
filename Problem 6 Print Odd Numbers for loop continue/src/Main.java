//Problem 6: Print Odd Numbers (for loop + continue)
public class Main {
    public static void main(String[] args){
                for(int i = 1; i<= 20; i++){
            if(i%2 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
