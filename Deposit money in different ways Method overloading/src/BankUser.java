public class BankUser {
    double amount;
    String currency;
    String note;
    String accountNumber;


    BankUser(double amount, String currency, String note, String acNum){
        this.amount = amount;
        this.currency = currency;
        this.note = note;
        accountNumber = acNum;
    }

    void deposit(int amount1){
        amount += amount1;
        //  System.out.println("Money Added, Now Balance : $" + amount);
        System.out.printf("Money Added, Now Balance : $%,.2f\n", amount);
    }

    void deposit(double amount1, String currency){
        if(currency == "bdt"){ // 1.0 US Dollar equal 121.75 Bangladeshi Taka
            amount += (amount1/121.75);
            // System.out.println("Money Added after converting to USD, Now Balance : $" + amount);
            System.out.printf("Now Balance : $%,.2f\n", amount);
        }
        if(currency == "usd"){
            amount += amount1;
//            System.out.println("Money Added, Now Balance : $" + amount);
            System.out.printf("Money Added, Now Balance : $%,.2f\n", amount);
        }
        if(currency == "eur"){
            amount += (amount1/0.85);
            System.out.printf("Money Added after converting to USD, Now Balance : $%,.2f\n", amount);
        }
        //future work!
        /*
        | Currency Code | Currency Name           | Region / Country               | Common Use / Similar To             |
        | ------------- | ----------------------- | ------------------------------ | ----------------------------------- |
        | **USD**       | United States Dollar    | United States                  | Global reserve, strong, widely used |
        | **EUR**       | Euro                    | European Union (19+ countries) | Second-most used, stable            |
        | **BDT**       | Bangladeshi Taka        | Bangladesh                     | Local currency, emerging economy    |
        | **GBP**       | British Pound Sterling  | United Kingdom                 | Oldest active currency, strong      |
        | **JPY**       | Japanese Yen            | Japan                          | Strong in Asia, safe-haven          |
        | **CNY**       | Chinese Yuan (Renminbi) | China                          | Fast-growing, Asia trade-heavy      |
        | **INR**       | Indian Rupee            | India                          | Heavily used, emerging economy      |
        | **CAD**       | Canadian Dollar         | Canada                         | Resource-backed, stable             |
        | **AUD**       | Australian Dollar       | Australia                      | Asia-Pacific trade, resource-heavy  |
        | **CHF**       | Swiss Franc             | Switzerland                    | Safe-haven, very stable             |
        | **SAR**       | Saudi Riyal             | Saudi Arabia                   | Oil-backed, Gulf-region strength    |
        | **AED**       | UAE Dirham              | United Arab Emirates           | Oil-rich, stable economy            |
        | **MYR**       | Malaysian Ringgit       | Malaysia                       | Southeast Asian trade-focused       |
        | **PKR**       | Pakistani Rupee         | Pakistan                       | Local economy, inflation-affected   |
        | **THB**       | Thai Baht               | Thailand                       | Tourism & exports, medium stable    |
        | **KRW**       | South Korean Won        | South Korea                    | High-tech economy, growing fast     |
         */
    }

    void deposit(int amount1, String accountNumber1, String newNote){
        note += " " + newNote;
        amount += amount1;
        accountNumber = accountNumber1;
        System.out.printf("Money Added, Now Balance : $%,.2f", amount);
        System.out.println(", Note: " + note);
//        System.out.println("Now Balance : $" + amount + ", Note: " + note);
    }
}
