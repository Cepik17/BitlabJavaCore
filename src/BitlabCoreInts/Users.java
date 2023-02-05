package BitlabCoreInts;
import java.util.Scanner;
public class Users {
    String name;
    String surname;
    public Users () {

    }
    public Users (String name, String surname){
        this.name= name;
        this.surname = surname;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

class UserTest {
    public static void main(String[] args) {
       /* Users users1 = new Users("Zhansaya", "Kulbaeva");
        Users users2 = new Users("Gennady", "Michael");
        Users users3 = new Users("Kyle", "Michael");
        Users users4 = new Users("Bethany", "Michael");
        Users users5 = new Users("Emily", "Oliver");
        Users users6 = new Users("Poppy", "Michael");
        Users users7 = new Users("Elizabeth", "Olivia");
        Users users8 = new Users("Elizabeth", "Oliver");
        Users users9 = new Users("Elizabeth", "Noah");
        Users users10 = new Users("Kyle", "Nurbekov");
        Users users11 = new Users("Thomas", "Joe");
        Users users12 = new Users("William", "Noah");
        Users users13 = new Users("Charlie", "Jacob");
        Users users14 = new Users("William", "Michael");
        Users users15 = new Users("Kyle", "Noah");
        Users[] users = {users1, users2, users3, users4, users5, users6, users7, users8, users9, users10, users11, users12, users13, users14, users15};
        UserBeanImp userBeanImp = new UserBeanImp(users);
        System.out.println("Find users by name");
        userBeanImp.getUsersByName("Elizabeth");
        System.out.println("Find users by surname");
        userBeanImp.getUsersBySurname("Michael");*/
        Scanner scanner = new Scanner(System.in);
        Users users1 = new Users(scanner.next(), scanner.next());
        Users users2 = new Users(scanner.next(), scanner.next());
        Users users3 = new Users(scanner.next(), scanner.next());
        Users users4 = new Users(scanner.next(), scanner.next());
        Users users5 = new Users(scanner.next(), scanner.next());
        Users users6 = new Users(scanner.next(), scanner.next());
        Users users7 = new Users(scanner.next(), scanner.next());
        Users users8 = new Users(scanner.next(), scanner.next());
        Users users9 = new Users(scanner.next(), scanner.next());
        Users users10 = new Users(scanner.next(), scanner.next());

        Users[] users = {users1,users2,users3,users4,users5,users6,users7,users8,users9,users10};

        UserBeanImp userBeanImp = new UserBeanImp(users);

        userBeanImp.getAllUsers();
        System.out.println("Find users by name John");
        userBeanImp.getUsersByName("John");
        System.out.println("Find users by surname Smith");
        userBeanImp.getUsersBySurname("Smith");
    }
}