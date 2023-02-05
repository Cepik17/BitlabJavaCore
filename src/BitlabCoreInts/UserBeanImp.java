package BitlabCoreInts;
/*#2
* Создайте интерфейс UserBean.java с методами:
void getAllUsers();
void getUsersByName(String name);
void getUsersBySurname(String surname);
Создайте класс UserBeanImp.java который реализовывает интерфейс UserBean(UserBeanImp implements от UserBean)
- Users[] users;
+UserBeanImp(Users[] users) - конструктор
Реализуйте все методы.
К примеру у нас есть 5 объект класса Users
Gennady Golovkin
Olivia Oliver
Bethany Oliver
Emily Oliver
Olivia Jack
Метод getAllUsers() выводит -> -> ->
Gennady Golovkin
Olivia Oliver
Bethany Oliver
Emily Oliver
Olivia Jack
Метод getUsersByName("Olivia") выводит -> -> ->
Olivia Oliver
Olivia Jack
Метод getUsersBySurname("Oliver") выводит -> -> ->
Olivia Oliver
Bethany Oliver
Emily Oliver*/
public class UserBeanImp implements UserBean {
    Users[] users;

    public UserBeanImp(Users[] users) {
        this.users = users;
    }

    public UserBeanImp() {
    }

    public Users[] getUsers() {
        return users;
    }

    public void setUsers(Users[] users) {
        this.users = users;
    }

    public void getAllUsers() {
        for (int i = 0; i < users.length; i++)
            System.out.println(users[i].name + " "+ users[i].surname);
    }

    public void getUsersByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if (name.equals(users[i].name)) {
                System.out.println(users[i].name + " " + users[i].surname);
            }
        }
    }
    public void getUsersBySurname(String surname) {
        for (int i = 0; i < users.length; i++) {
            if (surname.equals(users[i].surname)) {
                System.out.println(users[i].name + " " + users[i].surname);
            }
        }
    }

}
