package BitlabStream;

public class Car {
    String name;
    int maxSpeed;
    double engineVolume;

    public Car() {
    }

    public Car(String name, int maxSpeed, double engineVolume) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
}
