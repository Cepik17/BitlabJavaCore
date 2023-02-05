package BitlabCoreAbstraction;

public class MainArea {
    public static void main(String[] args) {
        Circle c1 = new Circle("Circle 1", 1);
        Circle c2 = new Circle("Circle 2", 3);
        Rectangle r1 = new Rectangle("rectangle1", 2, 3);
        Rectangle r2 = new Rectangle("rectangle2", 3, 4);

        double sumOfArea =0;
        Shape [] shapes = {c1,c2,r1,r2};
        for (int i =0; i< shapes.length; i++){
            System.out.println("Figure " + shapes[i].getArea());
            sumOfArea = sumOfArea + shapes[i].getArea();
        }
    }
}
