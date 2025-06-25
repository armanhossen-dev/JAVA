//Design a class called BankAccount that models a bank account
//with attributes like accountNumber, accountHolderName, and
//balance. Implement methods to deposit and withdraw money. If a
//withdrawal exceeds the balance, display an appropriate message.
//Questions:
//1. Create the BankAccount class with the appropriate attributes.
//2. Write methods for deposit and withdraw.
//3. Demonstrate creating an object of this class and performing a few transactions.

public class Main {
    public static void main(String[] args){
        BankAccount a1 = new BankAccount("A001","Arman Hossen Ripon",200);

        a1.displayAccountInfo();
        System.out.println();

        a1.withdraw(10);
        System.out.println();

        a1.deposit(3000);
        System.out.println();

        a1.deposit(40);
        System.out.println();
    }
}
