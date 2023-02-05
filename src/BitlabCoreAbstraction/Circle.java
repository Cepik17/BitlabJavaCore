package BitlabCoreAbstraction;

public class Circle extends Shape{

    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}
