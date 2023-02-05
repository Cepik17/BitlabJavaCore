package BitlabATM;

public class NationalBankAccount implements BankAccount {
    String fullName;
    String accountNumber;
    String pinCode;
    int balance;


    public NationalBankAccount() {
    }

    public NationalBankAccount(String fullName, String accountNumber, String pinCode, int balance) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.balance = balance;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public int totalBalance() {
        return balance;
    } // Данный метод возвращает текущий баланс

    public void creditBalance(int credit) {
        System.out.println(balance - credit);
    } // Данный метод мы используем при снятии денег со счета

    public void debetBalance(int debet) {
        System.out.println(balance + debet);
    } // Данный метод мы используем при добавлении денег к счету

    public String accountData() {
        return "Full Name: " + fullName + " Accountnumber: " + accountNumber + " Balance: " + balance + " Pincode: " + pinCode;
    }
}