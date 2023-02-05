package BitlabCoreAbstraction;
/*#15
* Создайте класс Student.java которая наследует от класса User.java с параметрами.
- String name;
- String surname;
- String group;
- double gpa;
Создайте конструкторы по умолчанию и с параметрами.
Создайте геттеры и сеттеры.
Реализуйте метод getUserData() которая должна возвращать все параметры пользователя.
Например, если id = 1, login = "zhansaya@mail.ru", password="qwerty",name="Zhansaya",surname="Kulbaeva",
group="IT1-2015",gpa=4.0, то будет
ID: 1 LOGIN: zhansaya@mail.ru PASSWORD: qwerty NAME: Zhansaya SURNAME: Kulbaeva GROUP: IT1-2015 GPA: 4.0*/
public class Student extends User {
    String name;
    String surname;
    String group;
    double gpa;

    public Student(int id, String login, String password, String name, String surname, String group, double gpa) {
        super(id, login, password);
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.gpa = gpa;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    String getUserData(){
        return "ID: " +id + " LOGIN: " + login + " PASSWORD: " + password +
                " NAME: " + name + " SURNAME: " + surname + " GROUP: " + group+ " GPA: " + gpa;
    }
}
