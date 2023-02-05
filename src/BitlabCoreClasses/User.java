package BitlabCoreClasses;
/*#16
* В вашем основном классе Main.java, вы должны создать обьект класса Student.java, Staff.java и User.java, и добавить их в массив из класса User.java.

Ввод данных должна быть реализована при помощи класса Scanner через консоль.

Чтобы добавить курсы пользователям, просто вызовите методы addSubject() & addCourse() для каждого объекта!

Ввод:

admin@mail.ru
admin12345
Kairat
Nurtas
zhansayak@mail.ru
qwerty12345
Zhansaya
Kulbaeva
36100
Chemistry
kamilla2000@mail.ru
asdasd13
Kamilla
Kamilova
4,0
Biology

Вывод:

ID: 1 FULL NAME: Kairat Nurtas LOGIN: admin@mail.ru PASSWORD: admin12345
ID: 2 FULL NAME: Zhansaya Kulbaeva LOGIN: zhansayak@mail.ru PASSWORD: qwerty12345 SALARY: 36100.0
SUBJECTS:
Chemistry
ID: 3 FULL NAME: Kamilla Kamilova LOGIN: kamilla2000@mail.ru PASSWORD: asdasd13 GPA: 4.0
COURSES:
Biology



Подсказка*

Для массивов subjects & courses вам не нужно создавать геттеры и сеттеры, а также вам нельзя его указывать в конструкторе. Если мы укажем массив в конструкторе - нам придется создавать массив на мейне и передавать уже готовый массив в наш конструктор, а мы этого не хотим! Нам нужен хардкор!

Что тогда делать?

Создаем специальную переменную index, которая следит за тем, сколько на самом деле было добавлено курсов/уроков. А это означает, что нужно создать методы addSubject(String subject) & addCourse(String course), которые будут добавлять по одному subject & course, в наши массивы, а еще будет фиксировать сколько на самом деле было добавлено курсов.
* Для вывода всех данных из массивов создайте специальные методы, которые запускают цикл и выводят на экран все данные. И да, в цикле должен использоваться index, вдруг у вас там всего 5 книг, а не все 100!*/

/*#17
* Создайте меню для первого задания, где вы управляете студентами, рабочими и пользователями.

PRESS [1] ADD USER
    PRESS [1] TO ADD STUDENT
    PRESS [2] TO ADD STAFF
PRESS [2] TO LIST USERS
    PRESS [1] TO LIST STUDENTS
    PRESS [2] TO LIST STAFF
PRESS [0] TO EXIT

(Подсказка: Фильтр вывода студента или рабочего нужно реализовать с помощью ключевого слова: instanceof)

instanceof - специальное ключевое слово, которая возвращает true, если объект является типом данного класса.

Например:

Dog d = new Dog();
if(d instanceof Dog){
System.out.println("I am a Dog");
}else{
System.out.println("I am not a Dog");
}

В данном примере, объект d является экземпляром класса Dog.java, соответственно возвращает true.*/
import java.util.Scanner;


public class User {
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;

    public User(int id, String login, String password, String name, String surname) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public void getData() {
        System.out.println("ID: " + id + " FULL NAME: " + name + " " + surname +
                " LOGIN: " + login + " PASSWORD: " + password);
    }
}

class userTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int input2;
        int id = 1;
        int n = 0;
        User[] users = new User[10];
        while (true) {
            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");
            input = scanner.nextInt();
            if (input == 1) {
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD STAFF ");
                input2 = scanner.nextInt();
                if (input2 == 1) {
                    System.out.println("Login: ");
                    String loginOfStudent = scanner.next();
                    System.out.println("Password: ");
                    String passwordOfStudent = scanner.next();
                    System.out.println("Name: ");
                    String nameOfStudent = scanner.next();
                    System.out.println("Surname: ");
                    String surnameOfStudent = scanner.next();
                    System.out.println("GPA: ");
                    double gpaOfStudent = scanner.nextDouble();
                    users[n] = new Student(id, loginOfStudent, passwordOfStudent, nameOfStudent, surnameOfStudent, gpaOfStudent);
                    n++;
                    id++;
                } else if (input2 == 2) {
                    System.out.println("Login: ");
                    String loginOfStaff = scanner.next();
                    System.out.println("Password: ");
                    String passwordOfStaff = scanner.next();
                    System.out.println("Name: ");
                    String nameOfStaff = scanner.next();
                    System.out.println("Surname: ");
                    String surnameOfStaff = scanner.next();
                    System.out.println("Salary: ");
                    double salaryOfStaff = scanner.nextDouble();
                    users[n] = new Staff(id, loginOfStaff, passwordOfStaff, nameOfStaff, surnameOfStaff, salaryOfStaff);
                    n++;
                    id++;
                }
            } else if (input == 2) {
                System.out.println("PRESS [1] TO LIST STUDENTS");
                System.out.println("PRESS [2] TO LIST STAFF");
                input2 = scanner.nextInt();
                if (input2 == 1) {
                    for (int i = 0; i < n; i++) {
                        if (users[i] instanceof Student)
                            users[i].getData();
                    }
                } else if (input2 == 2) {
                    for (int i = 0; i < n; i++) {
                        if (users[i] instanceof Staff)
                            users[i].getData();
                    }
                }
            } else if (input == 0)
                break;

           /* id++;
            System.out.println("Insert name?");
            String name = scanner.next();
            System.out.println("Insert surname?");
            String surname = scanner.next();
            System.out.println("Insert GPA?");
            double gpa = scanner.nextDouble();
            students[n] = new StudentCls(id, name, surname, gpa);
            n++;
        }
        if (input == 2) {
            for (int i = 0; i < n; i++)
                System.out.println(students[i].getStudentData());
        }
        if (input == 0)
            break;
    }

    Student student1 = new Student(scanner.nextInt(), scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.nextDouble());
    User user1 = new User(scanner.nextInt(), scanner.next(), scanner.next(), scanner.next(), scanner.next());
        staff1.addSubject("Math");
        student1.addCourse("FIS");
    User[] users = {staff1, student1, user1};

        staff1.getData();
*/
        }
    }
}
