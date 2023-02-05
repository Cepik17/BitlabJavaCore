package BitlabCoreAbstraction;
/*#,6,7
Создайте абстрактный класс GoldShape (золотая фигура), с абстрактным методом double getVolume().
+ abstract double getVolume()
Метод возвращает объем золотой фигуры. В этом классе есть уже реализованный метод  double getPrice().
+ double getPrice()
Метод возвращает цену за это золото.
Формула цены за золото выглядит таким образом:
volume * 250 + 1200
Создайте  класс SphereGold (Сферическое золото) который наследуется от класса GoldShape, и имеет такой параметр как:
- double radius;
Нужно будет переопределить абстрактный метод getVolume() используя формулу вычисления объема сферы из геометрии.
#9
* А теперь, в основном классе Main, создайте по 2 объекта класса SphereGold и CubeGold с разными параметрами.
Добавьте всех их в массив из абстрактного класса GoldShape, и выведите все цены на них при помощи метода - getPrice()
Ввод данных должна быть реализована при помощи класса Scanner через консоль.
Ввод:

5
6
2
4

Вывод:

132033.33333333334 KZT
227280.0 KZT
3200.0 KZT
17200.0 KZT*/
import java.util.Scanner;

abstract class GoldShape {

abstract double getVolume();

    double getPrice(){
        return getVolume() * 250+ 1200;
    }
}
class GoldShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CubeGold c1 = new CubeGold(scanner.nextDouble());
        CubeGold c2 = new CubeGold(scanner.nextDouble());
        SphereGold s1 = new SphereGold(scanner.nextDouble());
        SphereGold s2 = new SphereGold(scanner.nextDouble());
        GoldShape [] goldShapes = {c1,c2,s1,s2};
        for (int i = 0; i < goldShapes.length; i++) {
            System.out.println(goldShapes[i].getPrice());
        }
    }
}