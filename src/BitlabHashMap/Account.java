package BitlabHashMap;
/*#5
* Продолжайте работать над предыдущей задачей по учетным записям и ИИН. Нужно будет сделать поисковик, куда мы вводим ИИН. Если такого ИИН не существует, то выведите слово - "Account not found".
Ввод:
890102301734
Вывод:
Account Ilyas Zhuanyshev from Almaty has IIN number: 890102301734
Ввод:
890102777777
Вывод:
Account not found*/
import java.util.HashMap;
import java.util.Scanner;

public class Account {
    String name;
    String surname;
    String city;

    public Account() {
    }

    public Account(String name, String surname, String city) {
        this.name = name;
        this.surname = surname;
        this.city = city;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

class AccountTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String s = in.next();
        HashMap<String, Account> map = new HashMap<>();
        Account a1 = new Account("Ivan", "Ivanov", "Karaganda");
        Account a2 = new Account("Serik", "Berikov", "Almaty");
        Account a3 = new Account("Aliya", "Ahmetova", "Astana");
        Account a4 = new Account("Askar", "Askarov", "Shymkent");
        Account a5 = new Account("Bob", "Bobov", "LA");
        map.put(in.next(), new Account(in.next(), in.next(), in.next()));
        map.put(in.next(), new Account(in.next(), in.next(), in.next()));
        map.put(in.next(), new Account(in.next(), in.next(), in.next()));
        map.put(in.next(), new Account(in.next(), in.next(), in.next()));
        map.put(in.next(), new Account(in.next(), in.next(), in.next()));
        for (String key : map.keySet()) {
            System.out.println("Account " + map.get(key).name + " " + map.get(key).surname + " from " + map.get(key).city + " has IIN number: " + key);

        }
//        boolean found = true;
//        for (String key : map.keySet()) {
//            if (key.equals(s)) {
//                found = false;
//                System.out.println("Account " + map.get(s).name + " " + map.get(s).surname + " from " + map.get(s).city + " has IIN number: " + key);
//            }
//        }
//        if (found == true) {
//            System.out.println("Account not found");
//        }
    }
}