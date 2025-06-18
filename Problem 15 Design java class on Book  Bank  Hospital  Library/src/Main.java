//Problem 15:Design java class on
//● Book
//● Bank
//● Hospital
//● Library

public class Main {
    public static void main(String[] args){
        Book book1 = new Book("ABC English Book", "Arman", "xyz", 120);
        System.out.println("book1");
        book1.displayBookInfo();
        System.out.println();

        Bank bank1 = new Bank("Arman's Bank",2025,"DIU","Arman Hossen",1,"$10M");
        System.out.println("bank1");
        bank1.displayBankInfo();
        System.out.println();

        Hospital hospital1 = new Hospital("Mayer Dua Hospital", 2025, "Dottopara", "Arman Hossen", 1, 1);
        System.out.println("hospital1");
        hospital1.displayHospitalInfo();
        System.out.println();

        Library library1 = new Library("Baper Dua Library", 2025, "Rahat villa", "Arman Hossen", 302);
        System.out.println("library1");
        library1.displayLibraryInfo();
        System.out.println();
    }
}