public class Bank {
    String name;
    String address;
    String Owner;
    int userNumber;
    String reserved;
    int year;

    Bank(String name, int year, String address, String Owner, int userNumber, String reserved){
        this.name = name;
        this.year = year;
        this.address = address;
        this.Owner = Owner;
        this.userNumber = userNumber;
        this.reserved = reserved;
    }
    void displayBankInfo(){
        System.out.println("name = " +  name);
        System.out.println("year = " +  year);
        System.out.println("address = " +  address);
        System.out.println("Owner = " +  Owner);
        System.out.println("userNumber = " +  userNumber);
        System.out.println("reserved = " +  reserved);
    }
}