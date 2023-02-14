package BitlabLyambda;
/*#3
* Создайте класс Student.java у которого есть параметры:
String fullName;
int age;
double gpa;
int height;
Далее, создайте интерфейс BestStudent.java с абстрактным методом:
Student theBest(ArrayList<Student> students) - данный метод возвращает лучшего студента, но пока неизвестно по каким критериям, так как метод абстрактный
Далее, мы создаем класс StudentAwards.java у которого будет 4 метода:
Student theMostGPA(ArrayList<Student> students) - данный метод возвращает студента из списка у кого самый высокий GPA
Student theMostAge(ArrayList<Student> students) - данный метод возвращает студента из списка кто самый старший.
Student theLongFullName(ArrayList<Student> students) - данный метод возвращает студента из списка с самым длинным ФИО (количество букв)
Student theHighest(ArrayList<Student> students) - данный метод возвращает самого высокого студента из списка
Используйте лямбда выражения в каждом из методах (метод theBest(ArrayList<Student> students) интерфейса BestStudent.java)*/
import java.util.ArrayList;

public class StudentAwards {
    public Student theMostGPA(ArrayList<Student> students) {
        BestStudent best = (ArrayList<Student> students1) -> {
            Student max = students1.get(0);
            for (int i = 0; i < students1.size(); i++) {
                if (students1.get(i).gpa > max.gpa) {
                    max = students1.get(i);
                }
            }
            return max;
        };
        return best.theBest(students);
    }

    public Student theMostAge(ArrayList<Student> students) {
        BestStudent best = (ArrayList<Student> students1) -> {
            Student max = students1.get(0);
            for (Student student : students1) {
                if (student.age > max.age) {
                    max = student;
                }
            }
            return max;
        };
        return best.theBest(students);
    }

    public Student theHighest(ArrayList<Student> students) {
        BestStudent best = (ArrayList<Student> students1) -> {
            Student max = students1.get(0);
            for (int i = 0; i < students1.size(); i++) {
                if (students1.get(i).height > max.height) {
                    max = students1.get(i);
                }
            }
            return max;
        };
        return best.theBest(students);
    }

    public Student theLongFullName(ArrayList<Student> students) {
        BestStudent best = (ArrayList<Student> students1) -> {
            Student max = students1.get(0);
            for (int i = 0; i < students1.size(); i++) {
                if (students1.get(i).fullName.length() > max.fullName.length()) {
                    max = students1.get(i);
                }
            }
            return max;
        };
        return best.theBest(students);
    }
}

class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Vasya Pupkin", 21, 3.5, 180));
        students.add(new Student("John Doe", 20, 3.8, 190));
        students.add(new Student("Garry Smith", 29, 4.0, 174));
        students.add(new Student("Jenni Oliver", 34, 3.11, 159));
        StudentAwards studentAwards = new StudentAwards();
        Student bestStudent0 = studentAwards.theMostGPA(students);
        BestStudent bestStudent1 = studentAwards::theHighest; // - : чтобы вызвать метод theHighest в studentawards
        System.out.println("Best student by HEIGHT - > ");
        System.out.println("Student full name -> " + bestStudent1.theBest(students).fullName);
        System.out.println("Student age -> " + bestStudent1.theBest(students).age);
        System.out.println("Student gpa -> " + bestStudent1.theBest(students).gpa);
        System.out.println("Student height -> " + bestStudent1.theBest(students).height);
//        BestStudent bestStudent0 = studentAwards :: theMostGPA;
//        BestStudent bestStudent1 = studentAwards :: theMostAge;
//        BestStudent bestStudent2 = studentAwards :: theHighest;
        BestStudent bestStudent2 = studentAwards::theMostAge;
        System.out.println("The best student who has a high GPA -> " + bestStudent0.fullName);
        System.out.println("The best student who has a high AGE -> " + bestStudent2.theBest(students).fullName);
        System.out.println("The best student who has a high HIGHEST -> " + bestStudent1.theBest(students).fullName);
    }
}