public class BankAccount {
    String accountNumber;
    String accountHolderName;
    int balance;
    BankAccount(String accountNumber, String accountHolderName, int balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(int dAmount){
        if(dAmount>0){
            balance += dAmount;
            System.out.println("Deposite : +" + dAmount + " BDT");
            System.out.println("New Balance: " + balance + " BDT");
        }else {
            System.out.println("Deposit Amount Can't be Negative!");
        }

    }
    void withdraw(int wdAmount){
        if(wdAmount >  balance){
            System.out.println("Withdrawal exceeds the balance");
        }
        else if(wdAmount < 0){
            System.out.println("Withdraw Amount Can't be Negative!");
        }
        else{
            balance -= wdAmount;
            System.out.println("withdraw: -"+wdAmount + " BDT");
            System.out.println("New Balance: " + balance + " BDT");
        }
    }
    //withdrawal exceeds the balance, display an appropriate message

    void displayAccountInfo(){
        System.out.println("Owner Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }
//    void showBalance(){
//        System.out.println("Balance: " + balance);
//    }
}
