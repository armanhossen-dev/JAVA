class Book {
    String title;
    String author;
    String genre;
    int year;
    int page;

    public Book(String title, String author, String genre, int year, int page) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.page = page;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Publication Year: " + year);
        System.out.println("Pages: " + page);
        System.out.println("----------------------------------------");
    }
}