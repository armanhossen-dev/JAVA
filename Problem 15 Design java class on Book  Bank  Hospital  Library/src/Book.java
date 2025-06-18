public class Book {
    String BookName;
    String Writer;
    String Publisher;
    double Price;

    Book(String BookName, String Writer, String Publisher, double Price){
        this.BookName = BookName;
        this.Writer = Writer;
        this.Publisher = Publisher;
        this.Price = Price;
    }

    void displayBookInfo(){
        System.out.println("BookName: " + BookName);
        System.out.println("Writer: " + Writer);
        System.out.println("Publisher: " + Publisher);
        System.out.println("Price: " + Price);
    }
}
