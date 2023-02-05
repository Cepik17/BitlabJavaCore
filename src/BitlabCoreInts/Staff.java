package BitlabCoreInts;

import java.util.Scanner;

/*#5
* Получается, вы создаете несколько классов, которые наследуют от интерфейса Workers.java:
Staff.java (Рабочие)
- int id;
- String name;
- String surname;
- int salary;
Например, если id=1, name = "Ilyas", surname="Zhuanyshev", salary = 40000, то метод getWorkerData() будет
"ID: 1 NAME: Ilyas SURNAME: Zhuanyshev SALARY: 40000";
HRManagers.java (Отдел кадров)
- int id;
- String fullName;
- int salary;
Programmers.java (Программисты)
- int id;
- String nickname;
- int salary;
- int bonusSalary;
- double KPIValue;
Получается у каждого класса есть свои особенности, но ваша задача реализовать абстрактные методы.

В принципе при вызове метода getSalary() у всех классов возвращается значение зарплаты, но у программистов подсчет зарплаты идет таким образом:
* salary + KPIValue*bonusSalary. KPIValue - это коэффициент объема работы, выполненный за определенный период, и его значение от 0 до 1 включительно.*/
public class Staff implements Workers {
    int id;
    String name;
    String surname;
    int salary;

    public Staff(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Staff() {
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getWorkerData(){
        return "ID: " + id + " NAME: " + name + " SURNAME: " + surname +" SALARY: " + salary;
    }
    public int getSalary(){
        return salary;
    }
}
class staffTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Staff staff1 = new Staff(scanner.nextInt(), scanner.next(),scanner.next(), scanner.nextInt());
        Staff staff2 = new Staff(scanner.nextInt(), scanner.next(),scanner.next(), scanner.nextInt());
        Staff staff3 = new Staff(scanner.nextInt(), scanner.next(),scanner.next(), scanner.nextInt());
        Staff staff4 = new Staff(scanner.nextInt(), scanner.next(),scanner.next(), scanner.nextInt());
        Staff staff5 = new Staff(scanner.nextInt(), scanner.next(),scanner.next(), scanner.nextInt());

        Staff[] staff = {staff1,staff2,staff3,staff4,staff5};
        int index =0;
        int max =0;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getSalary() > max) {
                max = staff[i].getSalary();
                index = i;
            }
        }
        System.out.println("A staff with a high salary " + staff[index].getWorkerData());
        Staff tmp;
        // сортировка по убыванию
        for (int i =0; i < staff.length-1; i++){
            for (int j = 0; j < staff.length-i-1; j++){
                if (staff[j].getSalary() < staff[j+1].getSalary()){
                    tmp = staff[j];
                    staff[j] = staff[j+1];
                    staff[j+1] = tmp;
                }
            }

        }
        for (int i =0; i < staff.length; i++) {
            System.out.println(staff[i].getWorkerData());
        }
    }
}

