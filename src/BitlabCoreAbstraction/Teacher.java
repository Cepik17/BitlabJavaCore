package BitlabCoreAbstraction;
/*#16
* Создайте класс Teacher.java которая наследует от класса User.java с параметрами.
- String nickName;
- String status; //// например: Professor, Lecturer, Tutor, Assistant.
- String subjects[] = new String[10]; //// Предметы которые он ведет, максимум 10
- int sizeOfSubjects = 0;
Создайте конструкторы по умолчанию и с параметрами
Создайте геттеры и сеттеры
Для полей sizeOfSubjects и subjects[] создайте только геттеры.
Создайте специальный метод addSubject(String subject), которая добавляет предмет в массив subjects.
Реализуйте метод getUserData() которая должна возвращать все параметры пользователя.
Напримерю, если id = 1, login="ilyas@mail.ru", password="bitlab11111", nickName="teacher_2023", status="professor", то будет
ID: 1 LOGIN: ilyas@mail.ru PASSWORD: bitlab11111 NICKNAME: teacher_2023 STATUS: professor*/
public class Teacher extends User{
    String nickName;
    String status;
    String subjects[] = new String[10];
    int sizeOfSubjects = 0;

    public Teacher(int id, String login, String password, String nickName, String status/*, String[] subjects, int sizeOfSubjects*/) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
//        this.subjects = subjects;
//        this.sizeOfSubjects = sizeOfSubjects;
    }

    public Teacher() {
    }

    public String getNickName() {
        return nickName;
    }

    public String getStatus() {
        return status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addSubject(String subject){
        subjects[sizeOfSubjects] = subject;
        sizeOfSubjects++;
    }
    String getUserData(){
        return "ID: " +id + " LOGIN: " + login + " PASSWORD: " + password +
                " NICKNAME: " + nickName + " STATUS: " + status;
    }
}
