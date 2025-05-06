import java.util.MissingFormatArgumentException;

public class Main {
    public static void main(String[] args){
        boolean isStudent =  true;
        //if somebody is student then they will get 10% of ticket price
        boolean isSenior = true; //60+ years old
        double  price = 9.99;

        //System.out.println();

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                //total 30% , so i will multyply with the price 10-3 = 7, so '.7' times
                price *= .7;
            }
            else{
                System.out.println("You get a student discount of 10%");
                price *=.9;
            }
        }else{
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                price *= .8;
            }
            else{
                System.out.println("You have no discount");
                price *= 1;
            }
        }
        //System.out.println("The price of the ticket is : $"+price);
        System.out.printf("The price of the ticket is : $%.2f",price);

    }
}
/*
        if(){
            if(){

            }
            else if(){

            }
            else{

            }
        }
*/