public class Library {
    String Name;
    int Year;
    Book[] booksOfLibrary;
    // int howManyBooks = number_of_books();

    Library(String name, int year, Book[] booksArray){
        Name = name;
        Year = year;
        this.booksOfLibrary = booksArray;
    }

    int number_of_books(){
        int n = 0;
        for(Book b : booksOfLibrary){
            n++;
        }
        return n;
    }

    void displayLibraryInfo(){
        System.out.println("Library Info:");
        System.out.println("Name: " + Name);
        System.out.println("Year: " + Year);
        System.out.println("Number of Books: " + number_of_books());
    }

    void displayAllBooksInfo(){
        System.out.println("Library's All Books Info");
        int num = 1;
        for(Book b : booksOfLibrary){
            System.out.println(num+ ". "+b.getBookInfo());
            num++;
        }
    }
}