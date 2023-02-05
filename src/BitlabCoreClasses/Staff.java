package BitlabCoreClasses;
/*#14
* Далее, создайте класс Staff.java который наследует от класса
User.java с параметрами:

private double salary;
private String subjects[] = new String[100];
private int indexOfSubject = 0;

Создайте геттеры и сеттеры.

Переопределите метод getData() для класса Staff.java.

Например, если id= 1, login="zhansayakulbaeva@bk.ru", password= "qwerty12345", name= "Zhansaya", surname= "Kulbaeva", salary = 40000, subjects(Literature, History, Chemistry, Biology, Technology) то тогда текст вывода будет:

"ID: 1 FULL NAME: Zhansaya Kulbaeva LOGIN: zhansayakulbaeva@bk.ru PASSWORD: qwerty12345 SALARY: 40000"
"SUBJECTS:"
Literature
History
Chemistry
Biology
Technology*/
public class Staff extends User{
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff(int id, String login, String password, String name, String surname, double salary /*String[] subjects, int indexOfSubject*/) {
        super(id, login, password, name, surname);
        this.salary = salary;
        /*this.subjects = subjects;
        this.indexOfSubject = indexOfSubject;*/
    }

    public Staff() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int getIndexOfSubject() {
        return indexOfSubject;
    }

    public void setIndexOfSubject(int indexOfSubject) {
        this.indexOfSubject = indexOfSubject;
    }
    public void getData (){
        System.out.println("ID: " + id +" FULL NAME: "+ name + " " + surname +
                " LOGIN: " + login + " PASSWORD: " + password + " SALARY: " + salary);
        System.out.println("SUBJECTS:");
        for (int i =0; i<indexOfSubject; i++)
            System.out.println(subjects[i]);
    }

    public void addSubject(String subject){
            subjects[indexOfSubject] = subject;
            indexOfSubject++;
    }
}
