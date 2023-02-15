import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeFurnitureBudget {


    Scanner scanner = new Scanner(System.in);



    private int balanceAccount = scanner.nextInt();
    int getBalanceAccount() {
        System.out.println("Please insert your budget:\n");
        this.balanceAccount = balanceAccount;
        System.out.println(balanceAccount);
        return balanceAccount;
    }


}
