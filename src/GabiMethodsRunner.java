import java.util.Scanner;

public class GabiMethodsRunner {
    public static void main(String[] args) {

        MultiThreading object=new MultiThreading();
        object.start();
        MultiThreading object2=new MultiThreading();
        object2.sentence();
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name!");

        String name = scanner.next();
        String lastName = " Avasiloaei";

        System.out.println("Type in to verify if the word \"Gabi\" contains random characters:");
        String nameContent = scanner.next();
        System.out.println(name.contains(nameContent));
        boolean nameContentChecker = name.contains(nameContent);

        if (nameContentChecker == true) {
            System.out.println("It contains the given characters");
        } else {
            System.out.println("It doesn't contain the given characters");
        }
        System.out.println("Please confirm your name:\n");
        String nameConfirm = scanner.next();
        boolean nameConfirmation = name.equalsIgnoreCase(nameConfirm);
        if (nameConfirmation == true) {
            System.out.println("The name matches!");
        } else {
            System.out.println("The names don't match!");
        }

    }*/
}
}


