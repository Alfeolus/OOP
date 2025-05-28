public class Book {
    private String title;
    private String isbn;
    private Author author;

    Book(String title, String isbn, Author author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    String getTitle(){
        return title;
    }

    String getIsbn(){
        return isbn;
    }

    String getAuthor(){
        return author;
    }
}
