import java.util.ArrayList;

public class Library {
    ArrayList<Book> Books;
    Library(){
        Books = new ArrayList<>();
    }
    void addbook(Book b1){
        Books.add(b1);
    }
}
