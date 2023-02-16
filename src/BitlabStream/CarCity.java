package BitlabStream;
/*#5
* Создайте класс Car.java с параметрами.
- String name;
- int maxSpeed;
- double engineVolume;
Создайте конструкторы (по умолчанию и с параметрами)
Создайте геттеры и сеттеры
Далее, создайте класс CarCity.java в котором есть внутренний список:
- ArrayList<Car> cars = new ArrayList<>();
Заполните этот список машинами, создайте специальным метод - addCar(Car car), который добавляет объект класса Car.java в список
Далее, ваша задача создать метод:
Car firstGreatVolumeCar();
Данный метод возвращает первую машину, у которого объем двигателя выше 3.0. Используйте Stream API.
* #6
* В класс CarCity.java добавьте метод:
ArrayList<Car> search(String name);
Нужно сделать поиск по имени. Данный метод возвращает список машин которые соответствуют названию.
* Можете напрямую сравнивать название через метод equals().
* #7
* В класс CarCity.java добавьте метод:
ArrayList<Car> filterCars(
int fromSpeed, int toSpeed, double fromVolume, double toVolume);
Нужно сделать фильтр по двум критериям. Данный метод возвращает список машин которые соответствуют этим критериям.
Вы должны отфильтровать машины по максимальной скорости от fromSpeed до toSpeed (включительно), и одновременно по объему двигателя от fromVolume до toVolume(включительно).*/
import java.util.ArrayList;
import java.util.stream.Collectors;

public class CarCity {
    ArrayList<Car> cars = new ArrayList<>();
    public CarCity(ArrayList<Car> cars) {
        this.cars = cars;
    }
    public void addCar(Car car){
        cars.add(car);
    }
    public Car firstGreatVolumeCar(){
        return cars.stream()
                .filter(c -> c.getEngineVolume() > 3.0)
                .findFirst()
                .orElse(null);
    }
    public ArrayList<Car> search(String name){
        return (ArrayList<Car>) cars.stream() //нужен кастинг в ArrayList т.к метод collect собирает в list.
                .filter(c -> c.getName().equals(name))
                .collect(Collectors.toList());
    }

    public ArrayList<Car> filterCars(int fromSpeed, int toSpeed, double fromVolume, double toVolume){
        return (ArrayList<Car>) cars.stream()
                .filter(c->c.getMaxSpeed() >= fromSpeed && c.getMaxSpeed() <= toSpeed)
                .filter(c->c.getEngineVolume() >= fromVolume && c.getEngineVolume() <= toVolume)
                .collect(Collectors.toList());
    }

}
class CarTest{
    public static void main(String[] args) {
        Car car1 = new Car("Lamborgini S", 260, 3.1);
        Car car2 = new Car("Zhiguli 1950", 270, 2.7);
        Car car3 = new Car("Toyota", 280, 2.4);
        Car car4 = new Car("Zhiguli S class", 285, 2.1);
        Car car5 = new Car("Toyota", 245, 2.8);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        CarCity city = new CarCity(cars);
        System.out.println("Name: " + city.firstGreatVolumeCar().name);
        System.out.println("Max Speed: " + city.firstGreatVolumeCar().maxSpeed);
        System.out.println("Engine Volume: " + city.firstGreatVolumeCar().engineVolume);

        ArrayList<Car> carArrayList = city.search("Toyota");

        System.out.println("Found information on request Toyota ->");
        for (int i = 0; i < carArrayList.size(); i++) {
            System.out.println(carArrayList.get(i).getName() + " " + carArrayList.get(i).getMaxSpeed() + " " + carArrayList.get(i).getEngineVolume());
        }

        ArrayList<Car> myList = city.filterCars(245,270,2.1,2.8);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Name: " + myList.get(i).getName() + " Max Speed: " + myList.get(i).getMaxSpeed() + " Engine Volume: " + myList.get(i).getEngineVolume());
        }
    }
}
