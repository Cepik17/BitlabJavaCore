package BitlabCoreAbstraction;
/*#5
* В основном классе, создайте 2 шоколада (Snickers и Twix), 2 бургера (Burger King и McDonalds), 2 напитка (Coca Cola и Fuse Tea) с разными значениями. Затем, добавьте их в массив из абстрактного класса Food. Выведите название всех товаров с их калориями. В конце отдельно выведите самую калорийную из них.
Ввод:
Dark
11
Cocoa
10
BurgerKing
10
1
McDonalds
10
2
Frozen
5
true
Pomegranate
150
false
Вывод:

Dark - > 8140.0
Cocoa - > 7400.0
BurgerKing - > 8400.0
McDonalds - > 5600.0
Frozen - > 2000.0
Pomegranate - > 15000.0
The most high-calorie is Pomegranate - > 15000.0*/
import java.util.Scanner;

public abstract class Food {
    String name;

    public Food(String name) {
        this.name = name;
    }

    public Food() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getCalories();

}

class FoodTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Burger burger1 = new Burger();
        burger1.name = scanner.next();
        burger1.meatAmount = scanner.nextInt();
        burger1.meatType = scanner.nextInt();
        Burger burger2 = new Burger();
        burger2.name = scanner.next();
        burger2.meatAmount = scanner.nextInt();
        burger2.meatType = scanner.nextInt();
        Coke coke1 = new Coke();
        coke1.name = scanner.next();
        coke1.volumeLiters = scanner.nextDouble();
        coke1.isSparkling = scanner.nextBoolean();
        Coke coke2 = new Coke(scanner.next(), scanner.nextDouble(), scanner.nextBoolean());
        Chocolate choco1 = new Chocolate(scanner.next(), scanner.nextInt());
        Chocolate choco2 = new Chocolate(scanner.next(), scanner.nextInt());
        Food[] foods = {burger1,burger2,coke1,coke2,choco1,choco2};
        double max = 0;
        int index = 0;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].getCalories() > max) {
                max = foods[i].getCalories();
                index = i;
            }
        }
        System.out.println("The most high-calorie is "+foods[index].getName() +" - > "+ foods[index].getCalories());
    }
}
