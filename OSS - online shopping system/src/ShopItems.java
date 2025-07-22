public class ShopItems {
    double price;
    ShopItems(double p){
        price = p;
    }

    void applyDiscount(double percentage){
        price = price - (price*(percentage/100.0));
        System.out.println("Applying the Discount by " + percentage + "%, Now the price have to pay is : " + price);
    }

    void applyDiscount(int amount){
        price -= amount;
        System.out.println("Applying the Discount by Amount : " + amount + ", Now the price have to pay is : " + price);
    }

    void applyDiscount(){
         price -= price*(5.0/100);
        System.out.println("Applying the Discount by 5%, Now the price have to pay is : " + price);
    }
}
