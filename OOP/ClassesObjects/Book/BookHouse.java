package OOP.ClassesObjects.Book;

public class BookHouse
{
    Book[] bookhouse = new Book[1000];
    int size = 0;

    public void addBook (Book book) {
        bookhouse[size] = book;
        size++;
    }

    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(bookhouse[i]);
        }
    }

    public void searchBook(String name) {
        if(bookhouse[size] != null){
            System.out.println(bookhouse[size]);
        } else System.out.println("Data Not Found");
    }
}
