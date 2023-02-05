package BitlabTryCatch;
/*#4
* Создайте класс Book с параметрами:
int id;
String name;
String author;
Добавьте геттеры и сеттеры и оба конструктора
+ String getData(); ////данный метод возвращает все данные по книге
Создайте класс Library с параметрами:
String name;
String city;
Book books[] = new Book[5];
int index = 0;
Добавьте геттеры и сеттеры для каждого поля кроме index и массива books.
Создайте метод addBook(Book book), который добавляет книгу в список, и увеличивает значение index на 1.
Сздайте метод printBooks(); //// данный метод списком выводит данные по всем книгам
В ходе разработки и запуска, есть вероятность что человек может добавить в список не инициализированный объект класса Book (т.е. Book b = null), что приводит выбросу исключения NullPointerException, если мы хотим вывести его данные с помощью метода getData().
Ваша задача состоит в том, чтобы метод printBooks() самостоятельно отлавливала эту ошибку и вместо выброса из цикла программы, метод должен просто вывести сообщение: "The book is empty".
При добавлении книги в список книг при помощи метода addBook(Book book), вы должны отлавливать ошибку ArrayIndexOutOfBoundsException, которая выбрасывается при превышении размера массива. и вместо исключения, мы должны вывести на экран: "The library is full".*/
public class Library {

    String name;
    String city;
    Book books[] = new Book[5];
    int index = 0;

    public Library() {
    }

    public Library(String name, String city) {

        this.name = name;
        this.city = city;
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
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The library is full.");
        }
    }
    public void printBooks(){
      /*  Нужен цикл, чтобы решить проблему ниже
        Exception in thread "main" java.lang.NullPointerException: Cannot read field "id" because "this.books[this.index]" is null
        at BitlabTryCatch.Library.printBooks(Library.java:53)
        at BitlabTryCatch.Library.main(Library.java:71)*/
        int j=0;
        while(j<index) {
            try{
                System.out.println(books[j].getData());
                j++;
            }catch (NullPointerException e){
                System.out.println("The book is empty.");
                j++;
            }
        }
        }

    public static void main(String[] args) {
        Book book1 = new Book(0,"abc" ,"def");
        Book book2 = new Book(1,"asd" ,"zxc");
        Book book3 = new Book(2,"wer" ,"rfv");
        Book book4 = new Book(3,"tgb" ,"ujm");
        Book book5 = new Book(4,"ert" ,"sdf");
        Book book6 = new Book(6,"ewdrt" ,"sdwerf");
        Library lib1 = new Library("National", "Almaty");
        lib1.addBook(book1);
        lib1.addBook(book2);
        lib1.addBook(book3);
        lib1.addBook(book4);
        lib1.addBook(book5);
        lib1.addBook(book6);
        lib1.printBooks();




    }
}
