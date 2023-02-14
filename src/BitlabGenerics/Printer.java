package BitlabGenerics;
/*#1
* Создайте специальный класс Printer.java (Printer<T>) у который принимает в качестве шаблона любой вид класса (дженерики). У класса Printer.java будет универсальный объект (T).
Класс Printer.java имеет 4 метода:
void setValue(T value) - назначает значение вашего объекта
T getValue() - возвращает наш объект
void printValue() - выводит на консоль ваш объект -> // System.out.println("Value is " + value);
void refresh() - меняет данный объект на null, одним словом сбрасывает*/
public class Printer<T> {
    private T value;

    public void setValue(T value) {//назначает значение вашего объекта
        this.value = value;
    }

    public void printValue() {
        System.out.println("Value is " + value); //выводит на консоль ваш объек
    }

    public T getValue() { // возвращает наш объект
        return value;
    }

    public void refresh() {//- меняет данный объект на null, одним словом сбрасывает
        value = null;
    }
}
class PrinterTest{
    public static void main(String[] args) {

        Printer<Integer> printer1 = new Printer<>();
        printer1.setValue(29926);
        System.out.println(printer1.getValue());
        printer1.refresh();
        printer1.printValue();

        Printer<String> p1 = new Printer<>();
        p1.setValue("29926");
        Printer<Double> p2 = new Printer<>();
        p2.setValue(2992.6);
        Printer<Float> p3 = new Printer<>();
        p3.setValue(29926.45f);

        p1.printValue();
        p2.printValue();
        p3.printValue();

        p1.refresh();
        p2.refresh();
        p3.refresh();

        p1.printValue();
        p2.printValue();
        p3.printValue();
    }
}