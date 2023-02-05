package BitlabATM;

public class Database {

    public static BankAccount [] allAccounts = new BankAccount[10];

    static {
        allAccounts[0] = new CityBankAccount("Ilyas", "Zhuanyshev", "KZ01", "0123", 550000);
        allAccounts[1] = new CityBankAccount("Erbol", "Assanbek", "KZ02", "9875", 250000);
        allAccounts[2] = new NationalBankAccount("Ilyas Zhuanyshev","KZ03" , "7412", 2000);
        allAccounts[3] = new NationalBankAccount("Ivan Ivanov", "KZ12", "0001",568000);
        allAccounts[4] = new CityBankAccount("Bob", "Bobov", "KZ03", "9632", 10000);
        allAccounts[5] = new CityBankAccount("John", "Doe", "KZ11", "1234", 10025);
        allAccounts[6] = new NationalBankAccount("Leo Messi","KZ20" , "1101", 25874);
        allAccounts[7] = new NationalBankAccount("Cri Ro", "KZ13", "0205",789632);
        allAccounts[8] = new CityBankAccount("Michael", "Michael", "KZ05", "8789", 100);
        allAccounts[9] = new NationalBankAccount("Vladimir Vladimirov","KZ07" , "5256", 78960);
    }

}
class TestDatabase{
    public static void main(String[] args) {
        System.out.println("database:");
        for (int i =0; i < 10; i++){
            System.out.println(Database.allAccounts[i].accountData());
    }
    }
}
