import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();


        int c = a % 10;
        int b = a % 100 -c;
        System.out.println("b " + b);
        System.out.println("c " + c);
    }
}


/*
 while (true){

         if (nomerscheta.equals(Database.allAccounts[i].getAccountNumber()) && pincode.equals(Database.allAccounts[i].getPinCode())) {
         if (Database.allAccounts[i] instanceof CityBankAccount) {
         System.out.println("PRESS [1] TO CASH WITHDRAWAL // снять деньги\n" +
         "PRESS [2] TO VIEW BALANCE // просмотр баланса\n" +

         input = in.nextInt();
         if (input == 1) {
         System.out.println("Vvedite summu:");
         } else if (input == 2) {

         } else if (input == 3) {

         } else if (input == 4) {

         } else if (input == 5) {

         } else if (input == 6) break;

         } else if (Database.allAccounts[i] instanceof NationalBankAccount) {
         System.out.println("PRESS [1] TO CASH WITHDRAWAL\n" +
         "PRESS [2] TO VIEW BALANCE\n" +
         "PRESS [3] TO EXIT\n");
         input = in.nextInt();
         if (input == 1) {

         } else if (input == 2) {

         } else if (input == 3) break;

         }
         i++;
         }






         }*/
