package BitlabATM;


import java.sql.SQLOutput;
import java.util.Scanner;

public class CityBankATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        int debet;
        String newpin;
        int credit;
        int result = -2;
        //int i = 0;
        boolean b = true;
        boolean notfound = false;
        System.out.println("Vvedite nomer csheta:");
        String nomerscheta = in.next();
        System.out.println("Vvedite pin code:");
        String pincode = in.next();
        BankAccount activeAccount = null;
        //
        //while (i < 10) {
    /*    for (int i = 0; i < Database.allAccounts.length; i++) {
            if (nomerscheta.equals(Database.allAccounts[i].getAccountNumber()) && pincode.equals(Database.allAccounts[i].getPinCode())) {
                while (true) {
                    if (Database.allAccounts[i] instanceof CityBankAccount) {
                        System.out.println("PRESS [1] TO CASH WITHDRAWAL // снять деньги\n" +
                                "PRESS [2] TO VIEW BALANCE // просмотр баланса\n" +
                                "PRESS [3] TO CHANGE PIN CODE // изменить пин код\n" +
                                "PRESS [4] TO CASH IN ACCOUNT // добавить деньги в счет\n" +
                                "PRESS [5] TO VIEW ACCOUNT DATA // просмотр данные счета\n" +
                                "PRESS [6] TO EXIT // выход");
                        input = in.nextInt();
                        if (input == 1) {
                            System.out.println("Vvedite summu:");
                            credit = in.nextInt();
                            System.out.println("Ostatok na schete: ");
                            Database.allAccounts[i].creditBalance(credit);
                        } else if (input == 2) {
                            System.out.println("Vash balance:");
                            System.out.println(Database.allAccounts[i].totalBalance());
                        } else if (input == 3) {
                            System.out.println("Vvedite novyi pin kod:");
                            newpin = in.next();
                            Database.allAccounts[i].setPinCode(newpin);
                            System.out.println("Vash pin code uspeshno izmenen!");
                        } else if (input == 4) {
                            System.out.println("Vvedity summu dlya polpolneniya:");
                            debet = in.nextInt();
                            Database.allAccounts[i].debetBalance(debet);
                        } else if (input == 5) {
                            System.out.println(Database.allAccounts[i].accountData());
                        } else if (input == 6) {
                             b = false;
                             break;
                        }
                    } else if (Database.allAccounts[i] instanceof NationalBankAccount) {
                        System.out.println("PRESS [1] TO CASH WITHDRAWAL\n" +
                                "PRESS [2] TO VIEW BALANCE\n" +
                                "PRESS [3] TO EXIT\n");
                        input = in.nextInt();
                        if (input == 1) {
                            System.out.println("Vvedite summu:");
                            credit = in.nextInt();
                            System.out.println("Ostatok na schete: ");
                            Database.allAccounts[i].creditBalance(credit);
                        } else if (input == 2) {
                            System.out.println("Vash balance:");
                            System.out.println(Database.allAccounts[i].totalBalance());
                        } else if (input == 3) {
                            b = false;
                            break;
                        }


                    }

                }
              //  if (b ==false) break;
                //i++;
            } else notfound = true;
        if (b ==false) break;
        }
        if (notfound == true) {
            System.out.println("No SUCH USER");

        }*/
        for (int i = 0; i < Database.allAccounts.length; i++) { // check if account exist in database and pin is ok
            if (nomerscheta.equals(Database.allAccounts[i].getAccountNumber())) {
                result = -1;
                if (pincode.equals(Database.allAccounts[i].getPinCode())) {
                    result =0;
                    activeAccount = Database.allAccounts[i];
                }
            }

        }
        if (result == -2)
            System.out.println("NO SUCH USER");
        else if (result== -1) {
            System.out.println("WRONG PIN");
        }
        if (activeAccount instanceof CityBankAccount) {
            while (true) {
                System.out.println("PRESS [1] TO CASH WITHDRAWAL // снять деньги\n" +
                        "PRESS [2] TO VIEW BALANCE // просмотр баланса\n" +
                        "PRESS [3] TO CHANGE PIN CODE // изменить пин код\n" +
                        "PRESS [4] TO CASH IN ACCOUNT // добавить деньги в счет\n" +
                        "PRESS [5] TO VIEW ACCOUNT DATA // просмотр данные счета\n" +
                        "PRESS [6] TO EXIT // выход");
                input = in.nextInt();
                if (input == 1) {
                    System.out.println("Vvedite summu:");
                    credit = in.nextInt();
                    System.out.println("Ostatok na schete: ");
                    activeAccount.creditBalance(credit);
                } else if (input == 2) {
                    System.out.println("Vash balance:");
                    System.out.println(activeAccount.totalBalance());
                } else if (input == 3) {
                    System.out.println("Vvedite novyi pin kod:");
                    newpin = in.next();
                    activeAccount.setPinCode(newpin);
                    System.out.println("Vash pin code uspeshno izmenen!");
                } else if (input == 4) {
                    System.out.println("Vvedity summu dlya polpolneniya:");
                    debet = in.nextInt();
                    activeAccount.debetBalance(debet);
                } else if (input == 5) {
                    System.out.println(activeAccount.accountData());
                } else if (input == 6) break;
            }
        }
        else if (activeAccount instanceof NationalBankAccount){
            while (true) {
                System.out.println("PRESS [1] TO CASH WITHDRAWAL\n" +
                        "PRESS [2] TO VIEW BALANCE\n" +
                        "PRESS [3] TO EXIT");
                input = in.nextInt();
                if (input == 1) {
                    System.out.println("Vvedite summu:");
                    credit = in.nextInt();
                    System.out.println("Ostatok na schete: ");
                    activeAccount.creditBalance(credit);
                } else if (input == 2) {
                    System.out.println("Vash balance:");
                    System.out.println(activeAccount.totalBalance());
                } else if (input == 3) {

                    break;
                }
            }
        }
    }
}

