package BitlabCoreClasses;

import java.util.Scanner;

public class Phone2 {
    private String name;
    private String model;
    private int price;

    public Phone2() {
        this.name = "NO NAME";
        this.model = "NO NAME";
        this.price = 0;
    }
    public Phone2(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getCategory(){
        if (price > 1000)
            return "TOP";
        else if (price <= 1000 && price >= 500)
            return "MEDIUM";
        else return "SIMPLE";
    }
}
class Phone2Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Phone2 [] phones = new Phone2[10];
        phones[0] = new Phone2(in.next(), in.next(), in.nextInt());
        phones[1] = new Phone2(in.next(), in.next(), in.nextInt());
        phones[2] = new Phone2(in.next(), in.next(), in.nextInt());
        phones[3] = new Phone2(in.next(), in.next(), in.nextInt());
        phones[4] = new Phone2(in.next(), in.next(), in.nextInt());
        phones[5] = new Phone2(in.next(), in.next(), in.nextInt());
        phones[6] = new Phone2(in.next(), in.next(), in.nextInt());
        phones[7] = new Phone2(in.next(), in.next(), in.nextInt());
        phones[8] = new Phone2(in.next(), in.next(), in.nextInt());
        phones[9] = new Phone2(in.next(), in.next(), in.nextInt());
        for(int i =0; i< phones.length; i++){

            if(phones[i].getCategory() == "TOP"  || phones[i].getCategory() == "SIMPLE" );
            System.out.println(phones[i].getCategory());
        }
    }
}
