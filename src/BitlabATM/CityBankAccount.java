package BitlabATM;

public class CityBankAccount implements BankAccount {
    String name;
    String surname;
    String accountNumber;
    String pinCode;
    int balance;



    public CityBankAccount() {
    }

    public CityBankAccount(String name, String surname,String accountNumber, String pinCode, int balance ) {
        this.name = name;
        this.surname = surname;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.balance = balance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
    public int totalBalance(){
     return balance;
    } // Данный метод возвращает текущий баланс
    public void creditBalance(int credit){
        System.out.println(balance - credit);
    } // Данный метод мы используем при снятии денег со счета
    public void debetBalance(int debet){
        System.out.println(balance + debet);
    } // Данный метод мы используем при добавлении денег к счету
    public String accountData(){
        return "Name: " + name + " Surname: " + surname + " Account number: " + accountNumber +" Balance: " + balance +
                " Pincode: " + pinCode;   } // Данный метод возвращает данные о клиенте
}
class TestCity{
    public static void main(String[] args) {

            for (int i =0; i < 10; i++){
                Database.allAccounts[i].totalBalance();
            }
    }
}