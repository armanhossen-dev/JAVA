public class Main {
    public static void main(String[] args){
//        Aggregation = Represents a "has-a" relationship between objects.
//                      one object contains another object as part of its structure,
//                      but the contained object/s can exist independently.

        // to understand this concept we will create some book objects and library objects
        // the books and library can exist independently
        // a library object will have book object
        // we will create library class and book class

        Book b1 = new Book("vscode vs vs studio", 20,"Arman Hossen");
        Book b2 = new Book("Life After Coding", 25, "Ripon Ali");
        Book b3 = new Book("Why Coding", 30, "Santo Boy");
        Book b4 = new Book("WIFI And WIFE", 35, "Jibon ALi");
        Book b5 = new Book("Life and Pain", 100, "Pain Mama");

        // creating an array of book objects
        Book[] books = {b1, b2, b3, b4, b5};
        //let me add each book while creating new book

        Library l1 = new Library("ABC Private Library", 2025, books);
        System.out.println();
        l1.displayLibraryInfo();

        System.out.println();
        l1.displayAllBooksInfo();

    }
}