import java.util.ArrayList;

public class Main {
    static ArrayList<Book> Books = new ArrayList<>();

    public static void main(String[] args) {
        Book book1 = new Book("Bloody July", "People", "History", 2024, 36);
        Book book2 = new Book("Code++", "Arman Hossen", "Programming", 2020, 220);
        Book book3 = new Book("Echoes of Liberation", "Sohir Uddin", "Historical Fiction", 2021, 180);
        Book book4 = new Book("Digital Roots", "Farhana Nasrin", "Technology", 2022, 150);
        Book book5 = new Book("Green Delta", "Arman Hossen", "Environment", 2020, 95);

        Books.add(book1);         Books.add(book2);          Books.add(book3);
        Books.add(book4);         Books.add(book5);

//     displayAllBooks();

        searchBook("Code++");
        searchBook("Green Delta", "Arman Hossen");
        searchBook(2020);
        searchBook("Programming", 100);
    }

    public static void displayAllBooks() {
        System.out.println("============================ All Books =================================");
        int n = 0;
        for (Book a : Books) {
            n++;
            System.out.println(n + ". " + a.title + ", " + a.author + ", " + a.genre + ", " + a.year + ", " + a.page);
        }
        System.out.println("========================================================================");
    }
    // Overloaded methods
    public static void searchBook(String title) {
        for (Book a : Books) {
            if (a.title.equalsIgnoreCase(title)) {
                System.out.println("Book Found:");
                a.display();
            }
        }
    }

    public static void searchBook(String title, String author) {
        for (Book a : Books) {
            if (a.title.equalsIgnoreCase(title) && a.author.equalsIgnoreCase(author)) {
                System.out.println("Book Found:");
                a.display();
            }
        }
    }

    public static void searchBook(int publicationYear) {
        for (Book a : Books) {
            if (a.year == publicationYear) {
                System.out.println("Book Found:");
                a.display();
            }
        }
    }

    public static void searchBook(String genre, int minPages) {
        for (Book a : Books) {
            if (a.genre.equalsIgnoreCase(genre) && a.page >= minPages) {
                System.out.println("✅ Book Found:");
                a.display();
            }
        }
    }
}

//        System.out.println("\n🔍 Search by title:");
//        System.out.println("\n🔍 Search by title and author:");
//        System.out.println("\n🔍 Search by year:");
//        System.out.println("\n🔍 Search by genre and minimum pages:");
