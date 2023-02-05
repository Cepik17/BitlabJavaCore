package BitlabCoreAbstraction;

public class SphereGold extends GoldShape{
    double radius;

    public SphereGold() {
    }

    public SphereGold(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (4*3.14*radius*radius*radius)/3;
    }
}
