import java.util.Scanner;

public class FirstChallenge {


    public static void main(String[] args) {
        int price;
        Scanner scanner = new Scanner(System.in);
        FirstChallengeMethods test = new FirstChallengeMethods();
        System.out.println("Please your budget:\n");
        int budgetAccount = scanner.nextInt();
        System.out.println("Your budget is: " + budgetAccount + "$");
        System.out.println("Please select from the following menu the desired furniture\n");
        test.couch(300, "Couchland");
        test.chair(150, "Chairman");
        test.table(175, "Table-Factory");
        System.out.println("Please type in your choice:\n");

        do {

            String choice = scanner.next();
           if(choice!="stop"){
            System.out.println("How many pieces?");
            int pieces = scanner.nextInt();


            switch (choice) {
                case "couch":
                    budgetAccount = budgetAccount - (pieces * test.couchPrice);
                    System.out.println("You bought a couch!\nYour budget now is:" + budgetAccount);
                    break;
                case "chair":
                    budgetAccount = budgetAccount - (pieces * test.chairPrice);
                    System.out.println("You bought a chair!\nYour budget now is:" + budgetAccount);
                    break;
                case "table":
                    budgetAccount = budgetAccount - (pieces * test.tablePrice);
                    System.out.println("You bought a table!\nYour budget now is:" + budgetAccount);
                    break;
                case "stop":

                    System.out.println("Perfect!You're done shopping!\nYour remaining budget is:" + budgetAccount);
                    break;

                default:
                    System.out.println("This furniture piece does NOT exist!");
                    break;
            }}
            if (budgetAccount <= 0) {
                System.out.println("You don't have enough money!\nGO TO WORK!");
            }


        } while (budgetAccount > 0);}
    }






