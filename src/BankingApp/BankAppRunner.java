package BankingApp;

import java.util.Scanner;
import java.time.LocalTime;

public class BankAppRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInformation userInformation = new UserInformation();
        userInformation.setLastName("Avasiloaei");
        BankAccountInformation bankAccountInformation = new BankAccountInformation();
        BankingActions bankingActions = new BankingActions();

        bankAccountInformation.setAccountBalance(4500);
        bankAccountInformation.setAccountName("Gabriel's account balance:");

        System.out.println(userInformation.getLastName());
        userInformation.setFirstName("Gabriel");
        System.out.println(userInformation.getFirstName());
        userInformation.setUserAge(29);
        System.out.println(userInformation.getUserAge());
        System.out.println(userInformation.getUserId());
        System.out.println(userInformation.getFirstName() + " " + userInformation.getLastName() + "\n" + bankAccountInformation.getAccountName() + "\n" + bankAccountInformation.getAccountBalance() + "$");
        System.out.println("How much do you want to withdraw?");
        System.out.println("Remaining account ballance is:" + bankAccountInformation.setAccountBalance(bankAccountInformation.getAccountBalance() - bankingActions.setWithDrawSum(scanner.nextDouble())));
        System.out.println(bankingActions.getTime());

    }
}
