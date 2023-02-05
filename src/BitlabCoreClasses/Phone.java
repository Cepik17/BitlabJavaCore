package BitlabCoreClasses;

import java.util.Scanner;

public class Phone {
    String name;
    String model;
    int price;

    public Phone() {
        this.name = "NO NAME";
        this.model = "NO NAME";
        this.price = 0;
    }

    public Phone(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getData() {
        return name + " - " + model + " for " + price + " KZT";
    }
}

class PhoneTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phone p1 = new Phone();
        p1.name = scanner.next();
        p1.model = scanner.next();
        p1.price = scanner.nextInt();
        System.out.println(p1.getData());
        Phone p2 = new Phone(scanner.next(), scanner.next(), scanner.nextInt());
        System.out.println(p2.getData());
    }
}