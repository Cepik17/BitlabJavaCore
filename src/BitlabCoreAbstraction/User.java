package BitlabCoreAbstraction;
/*#14Создайте абстрактный класс User.java с параметрами:
- int id;
- String login;
- String password;
Создайте абстрактный метод:
+ abstract String getUserData();
Создайте конструкторы по умолчанию и с параметрами.
Создайте геттеры и сеттеры.*/

public abstract class User {
    int id;
    String login;
    String password;

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
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

    abstract String getUserData();
}
