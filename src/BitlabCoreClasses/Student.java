package BitlabCoreClasses;
/*#15
* Далее, создайте класс Student.java который наследует от класса User.java с параметрами:

private double gpa;
private String courses[] = new String[100];
private int indexOfCourses = 0;

Создайте геттеры и сеттеры.

Переопределите метод getData() для класса Student.java.

Например, если id= 1, login="zhansayakulbaeva@bk.ru", password= "qwerty12345", name= "Zhansaya", surname= "Kulbaeva", gpa= 4.0, courses(Literature, History, Chemistry, Biology, Technology) то тогда текст вывода будет:

"ID: 1 FULL NAME: Zhansaya Kulbaeva LOGIN: zhansayakulbaeva@bk.ru PASSWORD: qwerty12345 GPA: 4.0"
"COURSES:"
Literature
History
Chemistry
Biology
Technology*/
public class Student extends User{
    private double gpa;
    private String []courses = new String[100];
    private int indexOfCourses = 0;

    public Student(int id, String login, String password, String name, String surname, double gpa/*, String[] courses, int indexOfCourses*/) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
        //this.courses = courses;
        //this.indexOfCourses = indexOfCourses;
    }

    public Student() {
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int getIndexOfCourses() {
        return indexOfCourses;
    }

    public void setIndexOfCourses(int indexOfCourses) {
        this.indexOfCourses = indexOfCourses;
    }

    public void getData (){
        System.out.println("ID: " + id +" FULL NAME: "+ name + " " + surname +
                " LOGIN: " + login + " PASSWORD: " + password + " GPA: " + gpa);
        System.out.println("COURSES:");
        for (int i =0; i<indexOfCourses; i++)
            System.out.println(courses[i]);
    }

    public void addCourse(String course){
        courses[indexOfCourses] = course;
        indexOfCourses++;
    }
}
