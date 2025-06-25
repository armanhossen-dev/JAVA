public class Book {
    String title;
    String Author;
    int pageN;

    Book(String title, int pageN, String Author){
        this.title = title;
        this.pageN = pageN;
        this.Author = Author;
    }

    String getBookInfo(){
        return "Name: " + this.title + " (" + this.pageN + " pages) Author: " + Author ;
    }
}