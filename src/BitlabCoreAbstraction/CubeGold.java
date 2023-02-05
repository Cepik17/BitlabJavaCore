package BitlabCoreAbstraction;

public class CubeGold extends GoldShape{
    double side;

    public CubeGold(double side) {
        this.side = side;
    }

    public CubeGold() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getVolume() {
        return side*side*side;
    }
}
