import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        //shopping cart program
        Scanner scan = new Scanner(System.in);

        String item;
        double price;
        int quantitiy;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scan.nextLine();
        //System.out.println(item);

        System.out.print("What is the price for each?: ");
        price = scan.nextDouble();

        System.out.print("How many would you like?: ");
        quantitiy = scan.nextInt();

        String ss = (quantitiy > 1) ? "'s" : "";
        //condition ? value_if_true : value_if_false;

        total = price * quantitiy;
        //System.out.println("\nYou have bought " + quantitiy + " " + item + "'s");
        System.out.println("\nYou have bought " + quantitiy + " " + item + ss);
        System.out.print("Your total is " + currency );
        System.out.printf("%.2f\n", total); // i have used 'printf'
        /* or
            String formatted = String.format("%.2f", total);
            System.out.println(formatted);
        */
       scan.close();
    }
}