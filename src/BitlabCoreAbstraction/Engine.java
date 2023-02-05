package BitlabCoreAbstraction;
/*#10
* Создайте абстрактный класс Engine.java с параметрами:
- double engineVolume;
- int cylinderAmount;
- double engineWeight;
Обязательно создайте конструкторы (с параметрами и по умолчанию).
Геттеры и сеттеры
У данного класса будут абстрактные методы как:
+ abstract double efficiency();
 abstract double throttleEnergy();
+ abstract double breakEnergy();
А также обычный метод как:
+ double getMaxSpeed(){
     return (throttleEnergy()-breakEnergy())*efficiency();

 }
 * #13
 * В основном классе Main.java, создайте по 2 объектов класса FerrariEngine.java и RenaultEnigine.java с разными значениями.

Добавьте все в массив класса Engine.java.

Выведите максимальные скорости каждого объекта

Ввод данных должна быть реализована при помощи класса Scanner через консоль.
Ввод:
19
54
12
18
52
14
19
18
55
6
17
54
15
7
Вывод:

Received maximum speed: 25644.0
Received maximum speed: 23393.0
Received maximum speed: 10127.835000000001
Received maximum speed: 27257.985*/
import java.util.Scanner;
public abstract class Engine {
    double engineVolume;
    int cylinderAmount;
    double engineWeight;

    public Engine() {
    }

    public Engine(double engineVolume, int cylinderAmount, double engineWeight) {
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight = engineWeight;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getCylinderAmount() {
        return cylinderAmount;
    }

    public void setCylinderAmount(int cylinderAmount) {
        this.cylinderAmount = cylinderAmount;
    }

    public double getEngineWeight() {
        return engineWeight;
    }

    public void setEngineWeight(double engineWeight) {
        this.engineWeight = engineWeight;
    }

    abstract double efficiency();
    abstract double throttleEnergy();
    abstract double breakEnergy();

    double getMaxSpeed(){
        return (throttleEnergy()-breakEnergy())*efficiency();
    }
}
class EngineTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FerrariEngine ferrariEngine1 = new FerrariEngine(scanner.nextDouble(), scanner.nextInt(), scanner.nextDouble());
        FerrariEngine ferrariEngine2 = new FerrariEngine(scanner.nextDouble(), scanner.nextInt(), scanner.nextDouble());

        RenaultEngine renaultEngine1 = new RenaultEngine(scanner.nextDouble(), scanner.nextInt(), scanner.nextDouble(), scanner.nextDouble());
        RenaultEngine renaultEngine2 = new RenaultEngine(scanner.nextDouble(), scanner.nextInt(), scanner.nextDouble(), scanner.nextDouble());

        Engine[] engines = {ferrariEngine1,ferrariEngine2,renaultEngine1,renaultEngine2};
        for (int i = 0; i < engines.length; i++) {
            System.out.println("maximum speed -> " + engines[i].getMaxSpeed());
        }
    }
}
