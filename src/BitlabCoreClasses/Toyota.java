package BitlabCoreClasses;

public class Toyota extends Car{
    String manufacturer;

    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer) {
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }

    public Toyota() {
        super();
        this.manufacturer = manufacturer;
    }
    public String ride() {
        return "Toyota Car " +name + " " + model + " with max speed "+ maxSpeed + " km/h from " + year +" year with engine volume "
                + volume+" liters manufactured from " + manufacturer+ " is riding.";
    }
}
