package BitlabCoreAbstraction;

public class Rectangle extends Shape {

    int side1;
    int side2;

    public Rectangle(String name, int side1, int side2) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getArea() {
        return side1 * side2;
    }
}
