package BitlabTryCatch;
/*#3
* Создайте класс Company с параметрами:
String name;
Worker director;
Добавьте конструктор
+ String getData(); ////данный метод возвращает все данные по компании
Например, если name = "Apple", director.name = "Steve", director.surname="Jobs", то будет
"Company name: Apple. Information about director -> Steve Jobs."
Создайте класс Worker с параметрами:
String name;
String surname;
В классе main.java мы имеем два объекта класса Company, у одного из-них как Директор указано null. Что в следствии ведет к NullPointerException.*/
public class Company {
    String name;
    Worker director;

    public Company(String name, Worker director) {
        this.name = name;
        this.director = director;
    }

    public Company() {
    }

    public String getData() {
        try {
            return "Company name: " + name + ". Information about director -> " + director.name + " " + director.surname;
        } catch (NullPointerException e) {
            return "Data not found";
        }

    }

    public static void main(String[] args) {
        Company c1 = new Company("Apple", new Worker("Alex", "Che"));
        Company c2 = new Company("IBM", null);
        System.out.println(c1.getData());
        System.out.println(c2.getData());
    }
}
