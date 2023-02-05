package BitlabCoreClasses;

public class Mercedes extends Car{
    String classType;

    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType) {
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }

    public Mercedes() {

    }
    public String ride() {
        return "Mercedes Car " +name + " " + model + " with max speed "+ maxSpeed + " km/h from " + year +
                " with engine volume " + volume+" liters with " + classType+ " class is riding.";
    }
}
