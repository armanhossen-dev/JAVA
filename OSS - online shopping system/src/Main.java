public class Main {
    public static void main(String[] args){
        /*
        * a company is developing an online shopping system where users can apply discounts to their purchases.
        * implement a method applyDiscount that is overloaded in the following ways.
        * - if the user provides a percentage (e.g., applyDiscount(double percentage)), reduce the price by that percentage.
        * - if the user provides a fixed amount (e.g., applyDicount(int amount)), reduce the price by that amount.
        * - if no arguments are provided, apply a default discount of 5%.
        * - write the java class implementing these overloaded methods.
        */ // ei line gula lek ba na

        ShopItems dress1 = new ShopItems(1000.0);
        ShopItems dress2 = new ShopItems(1500.0);
        ShopItems dress3 = new ShopItems(2000.0);
        dress1.applyDiscount();
        dress2.applyDiscount(100);
        dress3.applyDiscount(50.0);
        /*
        Applying the Discount by 5%, Now the price have to pay is : 950.0
        Applying the Discount by Amount : 100, Now the price have to pay is : 1400.0
        Applying the Discount by 50.0%, Now the price have to pay is : 1000.0
        */
    }
}