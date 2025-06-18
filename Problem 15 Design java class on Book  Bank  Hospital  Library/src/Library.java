public class Library {
        String name;
        String address;
        String Owner;
        int TotalBook;
        int year;

    Library(String name, int year, String address, String Owner, int TotalBook){
            this.name = name;
            this.year = year;
            this.address = address;
            this.Owner = Owner;
            this.TotalBook = TotalBook;
        }
        void displayLibraryInfo() {
            System.out.println("name = " + name);
            System.out.println("year = " + year);
            System.out.println("address = " + address);
            System.out.println("Owner = " + Owner);
            System.out.println("TotalBook = " + TotalBook);
        }
}
