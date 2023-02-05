package BitlabCoreAbstraction;
/*#17
* Создайте класс ERPSystem.java которая управляет пользователями, с параметрами и методами:
- User []memory = new User[1000]; ////максимум 1000 пользователей
- int sizeOfUsers = 0;
void addUser(User u); //// метод добавляет пользователя
void printTeacher(); //// метод возвращает экземпляр класса Teacher
void printStudent(); //// метод возвращает экземпляр класса Student
void printUser(int index); //// метод выводит на экран одного пользователя, но если пользователь по данному индексу не существует, то выводит сообщение: "No such user in this index"*/
public class ERPSystem {
    User[] memory = new User[1000];
    int sizeOfUsers = 0;

    public void addUser(User u) {  //// метод добавляет пользователя
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    }

    public void printTeacher() { //// метод возвращает экземпляр класса Teacher
        for (int i = 0; i <= sizeOfUsers; i++) {
            if (memory[i] instanceof Teacher)
                System.out.println(memory[i].getUserData());
        }
    }

    public void printStudent() { //// метод возвращает экземпляр класса Student
        for (int i = 0; i <= sizeOfUsers; i++) {
            if (memory[i] instanceof Student)
                System.out.println(memory[i].getUserData());
        }
    }

    public void printUser(int index) {//// метод выводит на экран одного пользователя, но если пользователь по данному индексу не существует, то выводит сообщение: "No such user in this index"
        //for (int i = 0; i <sizeOfUsers; i++){
            if ((index-1) <= sizeOfUsers)
                System.out.println(memory[index-1].getUserData());
            else System.out.println("No such user in this index");

    }

}
class ERPSystemTest {
    public static void main(String[] args) {
        ERPSystem erpSystem1 = new ERPSystem();
        erpSystem1.addUser(new Student(1, "kamila@mail.ru", "kami15489", "Kamila", "Madi", "IT1-2018", 2));
        erpSystem1.addUser(new Student(2, "james@mail.ru", "james598", "James", "Jamesov", "IT1-2018", 2.3));
        erpSystem1.addUser(new Student(3, "madi@mail.ru", "madi9875", "Madi", "Madiev", "IT1-2018", 2));
        erpSystem1.addUser(new Student(4, "kamila@mail.ru", "kami15489", "Kamila", "Madi", "IT1-2018", 2));
        erpSystem1.addUser(new Student(5, "oliver@mail.ru", "oliver4785", "Oliver", "Jack", "IT1-2018", 3.4));
        System.out.println("Received data about users - > ");
        erpSystem1.printStudent();
        System.out.println("Find user by index");
        erpSystem1.printUser(5);
    }
}
