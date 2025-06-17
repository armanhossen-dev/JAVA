// Problem 5: Find First Divisible by 7 (for loop + break)
public class Main {
    public static void main(String[] args){
        int target = 7;
        boolean notfound = true;
        int i = 2;
        while(notfound){
            if(target % i == 0){
                System.out.println("First number divisible by 7 is: " + i);
                notfound =  false;
            }
            i++;
        }
    }
}
