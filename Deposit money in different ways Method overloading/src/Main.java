public class Main {
    public static void main(String[] args){
        /*
            A bank allows users to deposit money in different ways.
            Implement a method deposit with method overloading;
                - deposit(int amount): deposit the specified amount into the account.
                - deposit(double amount, String currency): deposits money after converting it to the default currency (assume USD conversion).
                - deposit(int amount, String accountNumber, String note); Deposits money with a transaction note.
            write the java class implementing these methods!
         */
        BankUser Arman = new BankUser(51000.0,"usd","First Salary","ACN1");
        // BankUser Hossen = new BankUser(100.0,"usd","Last Salary","ACN2");

        Arman.deposit(3000);
        Arman.deposit(40000, "bdt");
        Arman.deposit(5050, "eur"); //Euro
        Arman.deposit(200, "ACN3","Adding for future 😎");
    }
}
