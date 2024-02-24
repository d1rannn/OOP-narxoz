package TryCatch.Task4;

public class Library
{
    protected String name;
    protected String city;
    protected Book[] books = new Book[5];
    protected int index = 0;

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Library() {
        this.name = "";
        this.city = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addBook(Book book){
        try{
            books[index] = book;
            index++;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The library is full");
        }

    }

    public void printBooks(){
        for (int i = 0; i < index; i++) {
            try{
                books[i].getData();
            } catch (NullPointerException e) {
                System.out.println("The book is empty");
            }
        }
    }
}
