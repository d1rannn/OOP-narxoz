package OOP.Lesson12.Book;

public class Book
{
    int id;
    String bookName;
    String authorName;

    public Book(int id, String bookName, String authorName) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public String getData() {
        return "ID: " + id + ". Name: " + bookName + ". Author: " + authorName;
    }
}
