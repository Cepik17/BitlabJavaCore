package BitlabCoreAbstraction;
/*#12
* Создайте класс RenaultEnigine.java который наследует от класса Engine.java.
Он имеет дополнительный параметр:
- double extraTurboEnergy;
Создайте конструктор с параметрами и конструктор по умолчанию.
Реализуйте все абстрактные методы
В RenaultEnigine.java вы вычислите абстрактные методы по формуле:
Efficiency: 0.27
Throttle energy: engineVolume*cylinderAmount*110 + extraTurboEnergy
Break energy: engineWeight*2.1*/
public class RenaultEngine extends Engine{
    double extraTurboEnergy;

    public RenaultEngine() {
    }

    public RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public double getExtraTurboEnergy() {
        return extraTurboEnergy;
    }

    public void setExtraTurboEnergy(double extraTurboEnergy) {
        this.extraTurboEnergy = extraTurboEnergy;
    }

    @Override
    double efficiency() {
        return 0.27;
    }

    @Override
    double breakEnergy() {
        return engineWeight*2.1;
    }

    @Override
    double throttleEnergy() {
        return engineVolume*cylinderAmount*110 + extraTurboEnergy;
    }
}
