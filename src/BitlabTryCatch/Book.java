package BitlabTryCatch;

public class Book {
    int id;
    String name;
    String author;

    public Book() {
    }

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getData(){
        try{
            return "ID: " + id + " Name" + name + " Author" + author;
        }catch (NullPointerException e){
            return "The book is empty.";
        }

    }
}
