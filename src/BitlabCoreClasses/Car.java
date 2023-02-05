package BitlabCoreClasses;

import java.util.Scanner;

public class Car {
    String name;
    String model;
    int maxSpeed;
    int year;
    double volume;

    public Car(String name, String model, int maxSpeed, int year, double volume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }

    public Car() {
//        this.name = "name";
//        this.model = "model";
//        this.maxSpeed = 0;
//        this.year = 2000;
//        this.volume = 0.0;
    }

    public String ride() {
        return "Car " + name + " " + model + " with max speed " + maxSpeed + " km/h from " + year + " with engine volume " + volume + " liters is riding.";
    }


}

class CarTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[6];
        cars[4] = new Car(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());
        cars[5] = new Car(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());
        cars[2] = new Toyota(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble(), scanner.next());
        cars[3] = new Toyota(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble(), scanner.next());
        cars[0] = new Mercedes(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble(), scanner.next());
        cars[1] = new Mercedes(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble(), scanner.next());
        for (int i = 0; i < cars.length; i++)
            System.out.println(cars[i].ride());
    }
}