package BitlabCoreClasses;

import java.util.Scanner;

public class StudentCls {
    int id;
    String name;
    String surname;
    double gpa;

    public StudentCls() {
        this.id = 0;
        this.name = "noname";
        this.surname = "nofamily";
        this.gpa = 0.0;
    }

    public StudentCls(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getStudentData() {
        return /*id + ") " +*/ name + " " + surname + " " + gpa;
    }

    public String toString() {
        return name + " " + surname + " " + gpa;
    }

}



class StudentClsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int n = 0;
        int id = 0;
    /*    Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();*/
        StudentCls[] studentCls = new StudentCls[10];
    /*  students[0] = s1;
        students[1] = s2;
        students[2] = s3;*/
        while (true) {
            System.out.println("PRESS [1] TO ADD STUDENT\n" +
                    "\n" +
                    "PRESS [2] TO LIST STUDENT\n" +
                    "\n" +
                    "PRESS [0] TO EXIT");
            input = scanner.nextInt();
            if (input == 1) {

                id++;
                System.out.println("Insert name?");
                String name = scanner.next();
                System.out.println("Insert surname?");
                String surname = scanner.next();
                System.out.println("Insert GPA?");
                double gpa = scanner.nextDouble();
                studentCls[n] = new StudentCls(id, name, surname, gpa);
                n++;
            }
            if (input == 2) {
                for (int i = 0; i < n; i++)
                    System.out.println(studentCls[i].getStudentData());
            }
            if (input == 0)
                break;

        }
        //System.out.println(topStudent(students));
    }

    public static StudentCls topStudent(StudentCls studentCls[]) {
        double max = studentCls[0].gpa;
        int maxind = 0;
        for (int i = 0; i < studentCls.length; i++) {
            if (studentCls[i].gpa > max)
                maxind = i;
        }
        return studentCls[maxind];
    }
}


